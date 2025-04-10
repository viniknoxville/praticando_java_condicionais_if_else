package br.com.alura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "123456";

        System.out.println("Digite a senha: ");
        String tentativa = scanner.nextLine();

        if (senha.equals(tentativa)){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}
