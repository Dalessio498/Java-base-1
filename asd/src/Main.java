import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        //Criando uma matriz com 3 linhas e 3

        int[][] matriz = new int[3][3];
        //Ex 1x1, 1x2...etc

        for (int i = 0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = (i + 1) * (j + 1);

                System.out.printf("Valor para posição [%d] [%d]: " , i,j);
                matriz[i][j]= sc.nextInt();
            }
        }

        //Exibindo a matriz no console, formatada com tabulação

        for (int i = 0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();//Quebra de linha no final de cada linha
        }

    }
}