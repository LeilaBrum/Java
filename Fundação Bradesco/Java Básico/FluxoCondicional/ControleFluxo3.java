package ControleArrays.FluxoCondicional;
/*Utilizando o if, else if e else */
public class ControleFluxo3 {
    public static void main(String[] args) {
        int idade = 7;

        if (idade <= 7) {
            System.out.println("Ainda é uma criança");
        } else if (idade > 7 && idade <= 18) {
            System.out.println("É um adolescente");
        } else if (idade > 18 && idade <= 60) {
            System.out.println("É um idoso");
        } else {
            System.out.println("Está na melhor idade");
        }
    }
}
