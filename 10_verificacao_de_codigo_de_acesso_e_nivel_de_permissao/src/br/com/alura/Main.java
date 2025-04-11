package br.com.alura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoAcesso = 2023;

        System.out.println("Digite o código de acesso: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o nível de permissão: ");
        int nivel = scanner.nextInt();

        boolean codigoValido = codigo == codigoAcesso;
        boolean nivelValido = (nivel >= 1) && (nivel <= 3);

        if (codigoValido && nivelValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado ao sistema!");
        }
        if (!codigoValido) {
            System.out.println("Motivo: código de acesso invalido. ");
        }
        if (!nivelValido) {
            System.out.println("Motivo: nivel de permissão não autorizado. ");
        }
        scanner.close();
    }
}
