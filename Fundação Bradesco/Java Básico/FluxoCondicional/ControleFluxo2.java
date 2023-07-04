package ControleArrays.FluxoCondicional;
/* Utilizando o if e else */
public class ControleFluxo2 {
    public static void main(String[] args) {
        int num = 8;

        if ((num % 2) == 0) {
            System.out.println("Este número é par");
        } /* PARA FUNCIONAR CADA CLAUSULA DEVE SER FECHADA COM A CHAVE */
        else {
            System.out.println("Este número é impar");
        }

    }
}