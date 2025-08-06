import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[8];
        int valor = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um numero para a posição " + i + ": ");
            num[i] = scanner.nextInt();

        }
    }
}