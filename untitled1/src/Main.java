import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.printf("Valor para a posição [%d] [%d] ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf(matriz[i][j] + "\t");
                if (matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
            System.out.println();
        }
        System.out.printf("O maior numero é %d e está na posição [%d][%d]\n", maior, linhaMaior, colunaMaior);
    }
    }
