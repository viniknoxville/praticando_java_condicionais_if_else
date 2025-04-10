package br.com.alura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1º Nota:  ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite 1º Nota:  ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite 1º Nota:  ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        if (media >= 7.0){
            System.out.printf("O estudante teve média %.1f e foi aprovado." ,media);
            } else if (media >= 5.0){
            System.out.printf("O estudante teve média %.1f e está de recuperação.", media);
            } else {
            System.out.printf("O estudante teve média %.1f e foi reprovado.", media);
        }
        scanner.close();
    }
}