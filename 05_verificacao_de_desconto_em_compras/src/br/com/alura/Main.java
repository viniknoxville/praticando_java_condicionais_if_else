package br.com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.0) {
            double desconto = valorCompra * 0.10;
            double valorDesconto = valorCompra - desconto;
            System.out.printf("Desconto de 10%% aplicado. \nNovo valor: R$%.2f\n", valorDesconto);
        } else {
            System.out.printf("Nenhum desconto aplicado. \nValor total: R$%.2f\n", valorCompra);
        }
        scanner.close();
    }
}
