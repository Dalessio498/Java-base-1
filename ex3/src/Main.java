import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int soma = 0;
        for (int i =0; i < num.length; i++){
            System.out.println("Digite um numero para a posição " + i + ": ");
            num[i] = sc.nextInt();

        }
        System.out.println("\n Valores inseridos: ");
        for (int i =0; i < num.length; i++) {
            System.out.println("Numero da posição: " + i + ": \t" + num[i]);
            soma += num[i]; // somando os números enquanto lê
        }

            System.out.println("media: " + (soma/5));

        }

    }