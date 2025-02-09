package WhileLoop;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int totalStudents;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the total number of students: ");
            totalStudents = scanner.nextInt();
            scanner.nextLine();

            while (totalStudents > 0) {
                System.out.println("Enter the student's name:");
                String studentName = scanner.nextLine();

                System.out.println("Enter the student's age:");
                int studentAge = scanner.nextInt();
                scanner.nextLine();

                System.out.println("The name of the student is " + studentName + " and the age of the student is " + studentAge);

                totalStudents--;

                System.out.println("There are still " + totalStudents + " students left.");
            }
        }
    }
}
