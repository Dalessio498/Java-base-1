import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10]; //limita a quantidade de posiçoes do array (sempre começa pelo 0)

        for (int index = 0; index < numeros.length; index++) {
            System.out.println("Digite um numero para a posição " + index + ": ");
            numeros[index] = scanner.nextInt();
        }
        System.out.println("\nValores inseridos: ");
        for (int index = 0; index < numeros.length; index++) {
            System.out.println("numero da posição " + index + ": \t" + numeros[index]);

            if (numeros[index] > 100){
                System.out.println("Maior que 100");
            }
            else {
                System.out.println("Menor que 100");
            }
        }
    }
}