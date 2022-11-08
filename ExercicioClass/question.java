package ExercicioClass;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println(parImp(num));
    }
    public static String parImp(int num) {
        String resp;

        if (num % 2 == 0) {
            resp = "O numero é par";
        } else {
            resp = "O numero é impar";
        }

        return resp;

    }


}
