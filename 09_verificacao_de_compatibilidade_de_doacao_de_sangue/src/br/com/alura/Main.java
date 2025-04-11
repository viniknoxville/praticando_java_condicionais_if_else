package br.com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        boolean idadeValida = (idade >= 18 && idade <= 65);
        boolean pesoValido = peso > 50.0;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível. ");
        }
        if (!idadeValida) {
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        }
        if (!pesoValido) {
            System.out.println("Motivo: Deve pesar mais de 50 kg.");
        }
        scanner.close();
    }
}
