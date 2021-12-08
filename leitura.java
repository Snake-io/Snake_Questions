import java.util.*;
import java.io.*;
public class leitura {	
	public static void importar(ArrayList<String> adm, String po) {
		// Inicia uma try para se algo de errado acontecer, retornar a causa
				try {
		// Inicia a cria��o de um objeto Filereader
					FileReader arq = new FileReader(po + ".txt");
		// Inicia a leitura do arquivo
					BufferedReader lerArq = new BufferedReader(arq);
		// Leitura da primeira linha a �ltima linha
					String linha = lerArq.readLine();

		// Enquanto a linha for vazia
					while (linha != null) {
		// Adiciona uma nova linha no documento adm
						adm.add(linha);
						linha = lerArq.readLine();
		// Inicia a leitura da primeira � �ltima linha
					}
		// Fecha o arquivo
					arq.close();

				}
		// Retorna o imprevisto caso algum erro ocorra
				catch (IOException e) {
					System.err.printf("Erro na abertura do arquivo: %s.", e.getMessage());
				}
			}

	// Inicia a exporta��o de arquivos para um array com Exce��o  IO
		public static void exportar(ArrayList<String> adm, String po) throws IOException {
	// Cria uma variavel do tipo FileWriter para escrita
			FileWriter arq = new FileWriter(po + ".txt");
	// Escreve no documento
			PrintWriter gravarArq = new PrintWriter(arq);

			int i;	
	// Armazena o tamanho do array adm na variavel n
			int n = adm.size();
	// Faz a leitura de todas as posições
			for (i = 0; i < n; i++) {
	// Grava no documento adm com base na posição i
				gravarArq.printf("%s%n", adm.get(i));
			}
	// Fecha o documento
			gravarArq.close();
		}
	}

