package org.example;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite sua nota arredondada (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)");

            int media = scanner.nextInt();

            if (media == 10) {
                System.out.println("Parabéns, você foi um aluno excepcional!");
            } else if (media >= 7) {
                System.out.println("Parabéns! Você foi aprovado");
            } else {
                System.out.println("Você foi reprovado.5");
            }
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
