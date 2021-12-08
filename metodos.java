import java.util.*;
import java.io.*;

public class metodos {
	// Defini��o das variaveis jogador e inicializa��o
	private static int jogador1 = 0;
	private static int jogador2 = 0;
	// Cria��o do objeto Scanner
	private static Scanner ov = new Scanner(System.in);

	// Cria��o de um metodos com parametros do tipo array e String
	public static void incluir(ArrayList<String> adm, String pss) {
		Scanner ler = new Scanner(System.in);
		// Cria��o da vari�vel pren que define a String a ser adicionada
		String pren;
		System.out.printf("\nDigite a pergunta ser adicionada\n");
		pren = ler.nextLine();
		// Adiciona a String pren dentro do documento "adm".
		adm.add(pren);
		System.out.println("Pergunta adiciona!");
	}

	// Cria��o do metodo buscar
		public static void buscar(ArrayList<String> buscar, int ol) {
			Scanner ler = new Scanner(System.in);
			String s;
			// Defini��o da identifica��o dentro do documento solicitado
			if (ol < 10) {
				s = "br" + ol;
			}
			// Adiciona uma nova identifica��o acima de 9 perguntas
			else {
				s = "brb" + ol;
			}

			int i;
			// adiciona o tamanho do array buscar na variavel n
			int n = buscar.size();
			// Converter e caucatena na String S as palavras em mai�sculo
			s = s.toUpperCase();
			// Cria��o do array dados
			String dados[];
			// La�o de repeti��o
			for (i = 0; i < n; i++) {

				// Procura um valor no documento String. Enquanto for diferente de -1
				if (buscar.get(i).toUpperCase().indexOf(s) != -1) {
					// Se houver alguma string dentro do documento a busca come�a e armazena as informa��es ignorando o ; na vari�vel dados. 
					dados = buscar.get(i).split(";");
					// Imprime na tela as vari�veis dentro da posi��o 1 e ignora a posi��o 0 onde reside o id.
					System.out.printf("\n %s ", dados[1]);

				}

			}
		}

		//Cria��o do m�todo buscar
		public static void buscar2(ArrayList<String> buscar, int ol) {
	// Cria��o da fun��o de leitura e dos ids de identifica��o 
			Scanner ler = new Scanner(System.in);
			String s;
			if (ol < 10) {
				s = "br" + ol;
			} else {
				s = "brb" + ol;
			}
	//Cria��o da vari�vel que vai armazenar o tamanho do arraylist
			int i, n = buscar.size();
			s = s.toUpperCase();
	//Cria��o do vari�vel tempor�ria que vai armazenar as informa��es colhidas do arraylist
			String dados[];
	//fun��o for para percorrer o array list
			for (i = 0; i < n; i++) {
	//Sistema para comparar a vez do jogador 1
				if (i % 2 == 0) {
	//buscar com base no �ndice e armazenar os valores ignorando o �;�  dentro da vari�vel dados e fazer a compara��o dos dados a partir da posi��o 1 do array.
					if (buscar.get(i).toUpperCase().indexOf(s) != -1) {
						dados = buscar.get(i).split(";");
						jogador1 = (confirme(dados[1], resp())) + jogador1;
					}

				} else {
					if (buscar.get(i).toUpperCase().indexOf(s) != -1) {
						dados = buscar.get(i).split(";");
						jogador2 = (confirme(dados[1], resp())) + jogador2;
					}
				}
			}
		}

	// Fim

		//Cria��o do m�todo resul
		public static void resul() {
	//Cria��o do placar que vai exibir a pontua��o dos jogadores
			System.out.println("#######Placar########");
			System.out.println("Jogador 1             jogador 2");
			System.out.printf("%d                    %d", jogador1, jogador2);
	// if que vai comparar qual dos dois jogadores tem a maior pontua��o. 
			if (jogador1 > jogador2) {
				System.out.println("\nO vecendor � o jogador 1!!!!");

			}

			else {
	//Cria��o dos par�metros para inicial a compara��o do empate
				Integer jogo1;
				jogo1 = jogador1;
				Integer jogo2;
				jogo2 = jogador2;
				if (jogo1.equals(jogo2)) {
					System.out.println("\nOs jogadores empataram!!");
				} else {
	//Declara��o do vencedor
					System.out.println("\nO vencedor � o jogador 2!!!!!!");
				}

			}

		}

		//Cria��o do m�todo resp
		private static String resp() {
	//Exibe na tela as respostas possiveis
			System.out.println("\nDigite uma reposta a,b,c,d ou e :");
	//Faz a leitura dos dados de entrada
			return ov.nextLine();
		}

		//Cria��o do m�todo confirm que retorna um valor inteiro 
		private static int confirme(String a, String b) {
	//Comparativa entre os dados de entrada
			if (a.equals(b)) {
	//Computa��o dos pontos 
				return 1;
			} else {
				return 0;
			}
		}
	}
	// Fim


