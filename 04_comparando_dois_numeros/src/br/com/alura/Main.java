package br.com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O maior número é " + num1 + ".");
        } else {
            System.out.println("O maior número é " + num2 + ".");
        }

        scanner.close();
    }
}
