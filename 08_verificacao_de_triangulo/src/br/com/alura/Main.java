package br.com.alura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int ladoA = scanner.nextInt();

        System.out.println("Digite o primeiro lado: ");
        int ladoB = scanner.nextInt();

        System.out.println("Digite o primeiro lado: ");
        int ladoC = scanner.nextInt();

        if ((ladoA + ladoB) > ladoC && (ladoB + ladoC) > ladoA &&
                (ladoA + ladoC) > ladoB) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        scanner.close();
    }
}
