import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)

    {

        Scanner scanner = new Scanner(System.in);

        //Criando um array de valores inteiros de 5 posições
        int[] numeros = new int[5];

        //Preenchendo o array com valores multiplicando o indicie por 10
        for(int i =0; i<numeros.length; i++)

        {

            System.out.print("Digite um número para a posição " + i + ": ");
            numeros[i] = scanner.nextInt();

        }

        //-----------------------------------------------------------------------------------

        System.out.println("\n Números inseridos: ");
        //usando for-each para percorrer o array e exibir os valores
        for(int numero : numeros)

        {

            System.out.println("numero: \t" + numero);

        }
    }
}
