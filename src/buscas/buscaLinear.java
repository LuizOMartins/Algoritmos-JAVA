package buscas;

import java.util.Scanner;

public class buscaLinear {

	public static void main(String[] args) {		
		int [] numeros = new int[5]; 		
		Scanner leitor = new Scanner(System.in);
		for(int i= 0 ; i< numeros.length;i++) {
			//System.out.println(String.F"Digite um número:");
			System.out.println(String.format("Inisira os valores: %d", i));
			int numero = leitor.nextInt();
			numeros[i] = numero; 
		}
		
		System.out.println("numeros"+numeros);//posicao de memoria que o vetor esta alocado
		//leitor.close();
		//Problemas busca linear:  com valoers repetidos o algoritmo smpre pega ultima ocorrencia
		// do elemento
		// BUSCA LINEAR 
		System.out.println("** BUSCA LINEAR");
		System.out.println("Insira o valor a ser pesquisado");
		int alvo = leitor.nextInt();
		int posicaoResultado = -1;
		//CASOS
		//MELHOR CASO:1 
		//PIOR CASO: N VEZES
		for(int i= 0 ; i< numeros.length;i++) {
			if(numeros[i] == alvo) {
				posicaoResultado = i;
				//break; para a cada ocorrência
				
			}
		}
		if(posicaoResultado < 0) {
			System.out.println("Elemento não encontrado");
		}else { 
			System.out.println(String.format("Elemento [%d] encontrado na posição [%d] ", alvo, posicaoResultado+1));
		}
		System.out.println("***************************************");
		imprimiArray(numeros);
		
	}
	
	private static void imprimiArray(int[] array){		
		for(int i= 0; i< array.length;i++) {
			System.out.println(String.format("valores inseridos: posicao"+
			" [%d]: valor: %d ", i,array[i])); 
		}

	}

}
