package selectionSort;

public class selectionsort {

	public static void main(String[] args) {

		int [] numeros = {5,8,6,8,5,1,3}; 

		System.out.println("VETOR DESORDENADO");
		imprimirList(numeros);
		
		for(int i=0;i<numeros.length;i++) {
			int IndiceDoMenor = i;//começando em i
			for(int j = i+1;j<numeros.length;j++) {//j éa da frente
				if(numeros[j]<numeros[IndiceDoMenor]) {
					IndiceDoMenor = j;// se j < 
				}// pra cada valor de i de é percorrido o vetor interiro para char o menor valor
			}
			int temp =  numeros[IndiceDoMenor];
			numeros[IndiceDoMenor] =  numeros[i];
			numeros[i]= temp;
		}
			
		System.out.println("VETOR ORDENADO");
		imprimirList(numeros);

	}
	
	private static void imprimirList(int[] numeros) {
		for(int i =0; i < numeros.length;i++) {
			System.out.println(String.format("Posicao:[%d] | Valor[%d]", i,numeros[i]));
		}	
	}

}
