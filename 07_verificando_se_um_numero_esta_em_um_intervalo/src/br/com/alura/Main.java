package br.com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double emprestimo = scanner.nextDouble();

        if (emprestimo >= 1000 && emprestimo <= 5000) {
            System.out.printf("O valor R$ %.2f está dentro do intervalo permitido para empréstimo.", emprestimo);
        } else {
            System.out.printf("O valor R$ %.2f não está dentro do intervalo permitido para empréstimo.", emprestimo);
        }
        scanner.close();
    }
}
