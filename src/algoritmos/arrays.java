package algoritmos;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		int [] array = new int[5]; 
		
		Scanner leitor = new Scanner(System.in);
		for(int i= 0 ; i< array.length;i++) {
			//System.out.println(String.F"Digite um número:");
			System.out.println(String.format("Inisira os valores: %d", i));
			int numero = leitor.nextInt();
			array[i] = numero; 
		}
		System.out.println("numeros"+array);//posicao de memoria que o vetor esta alocado
		leitor.close();
		
		
		for(int i= 0 ; i< array.length;i++) {
			System.out.println(String.format("valores inseridos: posicao [%d]: valor: %d ", i,array[i])); 
		}

	}

}
