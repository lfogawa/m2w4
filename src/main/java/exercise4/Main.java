package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        while (true) {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

            try {
                if (idade <= 0 || idade > 100) {
                    throw new IllegalArgumentException("Digite uma idade válida.");
                } else {
                    System.out.printf("Olá, você tem %d anos de idade!%n", idade);
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}