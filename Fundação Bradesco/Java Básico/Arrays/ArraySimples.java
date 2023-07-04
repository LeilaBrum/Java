package Arrays;
import java.util.Arrays;

public class ArraySimples {
	public static void main (String [] args) {
		String[] paises = {"Brasil","Rússia", "India", "China"};
		
		/*Jeito simples*/
		System.out.println (paises[0]);
		
		/*Com biblioteca | Mostra todas as informações do array*/
		System.out.println(Arrays.toString(paises));
		
		/*Com biblioteca | Pesquisa um valor no array e retorna sua posição*/
		int posicao = Arrays.binarySearch(paises, "Brasil");
		System.out.println(posicao);
		
		/*Ordenar em ordem alfabética o array apartir da primeira posição (0)*/
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
	}
}
