package br.com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String diaSemana = scanner.nextLine();

        if (diaSemana.equals("segunda") || diaSemana.equals("terça") ||
                diaSemana.equals("quarta") || diaSemana.equals("quinta") ||
                diaSemana.equals("sexta")) {
            System.out.println(diaSemana + " é um dia útil.");
        } else {
            System.out.println(diaSemana + " não é um dia útil.");
        }
        scanner.close();
    }
}
