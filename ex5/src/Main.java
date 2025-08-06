import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        int Cpares=0;
        int Cimpares=0;


        for (int i = 0; i < num.length; i++) {
            System.out.println("Insira o numero para a posição " + i + ": ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                Cpares++;
            } else {
                Cimpares++;
            }
        }

        int[] Pares = new int[Cpares];
        int[] Impares = new int[Cimpares];

        int iPares =0, iImpares=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
               Impares[iImpares++] = num[i];
            }
            else {
                Pares[iPares++] = num[i];
            }
        }
            System.out.println("Numeros impares\n ");
            for (int impar : Impares) {
                System.out.println(impar);
            }

                System.out.println("Numeros pares\n ");
                for (int pares : Pares) {
                    System.out.println(pares);
                }

    }

}
