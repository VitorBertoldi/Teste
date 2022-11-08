package ExercicioClass;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;


        if (args.length == 0) {
            System.out.println("Digite dois numeros: ");
        }

        else if (args.length == 1) {
            System.out.println("Digite mais um numero: ");
        }

        else if (args.length == 2) {
            for(String n:args) {
                int v = Integer.valueOf(n);
                soma += v;
            }
            System.out.println("A soma dos numeros é " + soma);
        }

        else {
            System.out.println("Quantidade inválida de args!!");
        }



    }

}
