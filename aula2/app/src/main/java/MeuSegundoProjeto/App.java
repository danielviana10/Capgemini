package MeuSegundoProjeto;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
            int soma = 0;
            for (int i = 1; i <= numero; i++) {
                soma += i;
            }
            
            System.out.println("Soma dos números de 1 até " + numero + ": " + soma);
        }
        catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
