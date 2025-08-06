import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array de valores inteiros com 5 posições
        int[] numeros = new int[5];

        // Preenchendo o array com valores inseridos pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Usando for tradicional para percorrer o array e exibir os valores
        System.out.println("\nValores inseridos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número na posição " + i + ": \t" + numeros[i]);
        }

        scanner.close(); // Boa prática: fechar o Scanner
    }
}
