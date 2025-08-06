import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int countPares = 0;  // Contador para pares
        int countImpares = 0; // Contador para ímpares

        // Lê os números do usuário
        for (int i = 0; i < num.length; i++) {
            System.out.println("Insira o numero para a posição " + i + ": ");
            num[i] = sc.nextInt();
        }

        // Conta os números pares e ímpares
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        // Criação dos arrays com base nos contadores
        int[] pares = new int[countPares];
        int[] impares = new int[countImpares];

        // Preenche os arrays de pares e ímpares
        int indexPar = 0, indexImpar = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares[indexPar++] = num[i];
            } else {
                impares[indexImpar++] = num[i];
            }
        }

        // Exibe os números pares
        System.out.println("\nNúmeros Pares: ");
        for (int par : pares) {
            System.out.println(par);
        }

        // Exibe os números ímpares
        System.out.println("\nNúmeros Ímpares: ");
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}