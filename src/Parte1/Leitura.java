package Parte1;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual seu file favorito?");
        String filme = leitura.nextLine();


        System.out.println("Informe sua idade:");
        int idade = leitura.nextInt();

        System.out.println("Informe a avaliacao:");
        double avaliacao = leitura.nextDouble();




        System.out.println(filme);
        System.out.println(idade);
        System.out.println(avaliacao);


    }
}
