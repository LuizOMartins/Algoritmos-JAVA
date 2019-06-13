package buscaBinaria;

import java.util.Scanner;

public class buscaBinaria {

	public static void main(String[] args) {
		//Busca binaria:  conjunto de dados ordenados
		// dividir para conquistar
		
		Scanner leitor =  new Scanner(System.in);
		
		int [] numeros = {0,1,2,3,4,5,6,7,8,9};
		int inicio = 0;
		System.out.println(String.format("TAMANHO VETOR %d", numeros.length));
		int fim = numeros.length-1;
		int meio = 0;
		int resultado = -1;
		
		System.out.println("Digite o elemento a ser encontrado");
		int alvo = leitor.nextInt();
		
		while(inicio<= fim) {
			meio  = (inicio + fim)/2;
			if(numeros[meio]< alvo) {
				inicio = meio +1;
			}else if (numeros[meio] > alvo) {
				fim = meio -1;
			} else if (numeros[meio] == alvo) {
				resultado = meio;
				break;
			}
			//System.err.println("while");
		}
		
		if(resultado<0) {
			System.err.println("NUMERO NÃO ENCONTRATO");
		}
		else {
			System.out.println(String.format("Valor: [%d] | Posicao [%d]", alvo, resultado));
		}

	}

}
