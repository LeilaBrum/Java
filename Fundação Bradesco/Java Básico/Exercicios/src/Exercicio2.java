/*Escreva um programa em Java que recebe
 * a idade de uma pessoa e verifica se ela
 * é elegível para votar. Considere que a
 * idade mínima para votar é 18 anos.
 * O programa deve exibir uma mensagem 
 * indicando se a pessoa pode ou não votar.
 */
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String [] args) {
		int idade;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite a idade");
		idade = ler.nextInt();
		
		if(idade >=18) {
			System.out.println("Já pode votar");
		}
		else {
			System.out.println("Não pode votar");
		}
	}
}
