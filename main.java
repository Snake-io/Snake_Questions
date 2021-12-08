//importaçãoo das bibliotecas
import java.util.*;
import java.io.*;
//criação da classe main com uma exception caso ocorra um erro
public class main {
public static void main(String[] args) throws IOException {  
//Declaraçãoo das listas de array
	ArrayList<String> perguntas = new ArrayList();
	ArrayList<String> respostas = new ArrayList();
	ArrayList<String> com = new ArrayList();
//Cria��o dos objetos 
 Scanner ler = new Scanner(System.in);
 metodos oc = new metodos();
 leitura oa = new leitura();
//Declara��o da vari�vel de op��o
 int option;
//menu
 System.out.println("MENU: ");
 System.out.println("Selecione 1 para iniciar o jogo");
 System.out.println("Selecione 2 para adicionar novas perguntas");
//Variavel de leitura
 option = ler.nextInt();
//Inicio da funçãoo switch-case
 switch(option){
 case 1:
 	int ol=0;
//Importação dos arquivos de texto
 	oa.importar(com, "com");
 	oa.importar(respostas, "respostas");
//do-while para verificar a vez do jogador
 	do {
 		Integer s=ol%2;
 		Integer ope=0;
 		if((s).equals(ope)) {
 			System.out.println("Vez do Jogador 1");
 		}
 		else {
 			System.out.println("Vez do Jogador 2");
 			}
//invoca��o dos m�todos buscar1 e buscar2
//buscar1 exibe na tela as perguntas
 	oc.buscar(com, ol);
//buscar2 faz a computa��o dos resultados.
 	oc.buscar2(respostas, ol);
 	ol++;
 	}
//define o total de perguntas no arquivo
 	while (ol<11);
//mostra os resultados
 	oc.resul();
 	break ;
 case 2: 
//Inicio do sistema de adicionamento de perguntas
 	System.out.println("Selecione 1 para adicionar uma nova pergunta");
 	System.out.println("Selecione 2 para fechar o programa");
 	option = ler.nextInt();
//case para verificar a op��o escolhida
 	switch(option) {
 	case 1: 
 	 	System.out.println("Selecione 1 para adicionar uma nova pergunta");
//Importa o arquivo de texto para o arraylist atual
    	oa.importar(perguntas, "perguntas");
//faz a leitura que o usu�rio digitar
 		option = ler.nextInt();
//verifica o que digitou 
 		switch(option){
//adiciona a nova pergunta
 		case 1: oc.incluir(perguntas, "perguntas");break;
 		}
//exporta o arraylist atual para o arquivo de texto
 		oa.exportar(perguntas, "perguntas");
 	// finaliza o programa
 	case 2: break;
 }
 }
}
}
