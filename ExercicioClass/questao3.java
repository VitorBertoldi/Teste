package ExercicioClass;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Menu de opções -----");
        System.out.println("1= soma");
        System.out.println("2= subtação");
        System.out.println("3= divisão");
        System.out.println("4= multiplicação");
        System.out.println("Digite a opção desejada: ");
        int opc = sc.nextInt();

        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextInt();

        if (opc == 1){
            double soma = num1 + num2;
            System.out.println("A soma dos numeros é: " + soma);
        }

        else if (opc == 2) {
            double subtração = num1 - num2;
            System.out.println("A subtração dos numeros é: " + subtração);
        }

        else if (opc == 3) {
            double divisão = num1 / num2;
            System.out.println("A divisão dos numeros é: " + divisão);
        }

        else if (opc == 4) {
            double multiplicacão = num1 * num2;
            System.out.println("A multiplicação dos numeros é: " + multiplicacão);
        }

        else {
            System.out.println("Opção invalida!!");
        }

    }
}
