//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)

    {

        //Criando um array de valores inteiros de 5 posições
        int[] numeros = new int[5];
        //Preenchendo o array com valores multiplicando o indicie por 10
        for(int i =0; i<numeros.length; i++)

        {

            numeros[i] = i*10; //exemplo: 0, 10, 20, 30, 40

        }

        //-----------------------------------------------------------------------------------

        //usando for-each para percorrer o array e exibir os valores
        for(int numero : numeros)

        {

        System.out.println("numero: " + numero);

        }
    }
}
