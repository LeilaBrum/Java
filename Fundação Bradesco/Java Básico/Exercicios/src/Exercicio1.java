import java.util.Scanner;

/*Escreva um programa em Java que recebe
 * um número inteiro e verifica se ele é positivo,
 * negativo ou igual a zero. Em seguida, exiba uma
 * mensagem adequada de acordo com o resultado da verificação.*/

/*Utilizando o if, else if e else */
public class Exercicio1 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um número");
		num = ler.nextInt();
		
		if (num > 0) {
			System.out.println("Esse número é positivo");
		}
		else if (num == 0) {
			System.out.println("Esse número é igual a 0");
		}
		else {
			System.out.println("Esse número é negativo");
		}
	}
}
