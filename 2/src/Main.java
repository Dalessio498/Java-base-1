import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maior = 0; // começa com o menor valor possível
        int linhaMaior = -1;
        int colunaMaior = -1;

        System.out.println("=== Digite os valores da matriz ===");

        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Valor para posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== Neandertal começa a caçada pelo tesouro ===");

        // Neandertal percorre a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Neandertal olha posição [%d][%d] e vê %d\n", i, j, matriz[i][j]);

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                    System.out.printf("🔥 Novo tesouro encontrado! Maior agora é %d na posição [%d][%d]\n", maior, linhaMaior, colunaMaior);
                }
            }
        }

        System.out.println("\n=== Fim da caçada ===");
        System.out.printf("O maior tesouro é %d e está na posição [%d][%d]\n", maior, linhaMaior, colunaMaior);
    }
}