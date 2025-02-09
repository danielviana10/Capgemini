package ExercicioIntervalo;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int number;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type a number:");

            number = scanner.nextInt();

            if (number >= 1 && number <= 50){
                System.out.println("The number is within the range.");
            }
            else {
                System.out.println("The number is out of the range");
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
