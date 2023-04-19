package Parte1;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    int number = -1;
    int aleatorio;

    public int geraAleatorio(){
        aleatorio = new Random().nextInt(10);
        return aleatorio;
    }

    public void ehIgual(){
        if (aleatorio == number){
            System.out.println("Parabéns, você acertou!");
        } else{
            System.out.printf("Você errou, eu pensei em %d ", aleatorio);
            System.out.println();
        }
    }

    public void acertaOuErra(){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Qual número eu pensei de 0 a 10?: ");
            number = leitor.nextInt();
        }


    public static void main(String[] args) {
        Aleatorio jogo = new Aleatorio();

        for (int i = 0; i < 3; i++) {
            jogo.geraAleatorio();
            jogo.acertaOuErra();
            jogo.ehIgual();
        }
    }




}
