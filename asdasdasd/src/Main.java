import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;



        while (true) {

            System.out.println("Sistema de Calculadora");
            System.out.println("----------------------");
            System.out.println("-----MENU INICIAL-----");
            System.out.println("1. Soma            || ");
            System.out.println("2. Subtração       || ");
            System.out.println("3. Multiplicação   || ");
            System.out.println("4. Divisão         || ");
            System.out.println("5. Potencia        || ");
            System.out.println("6. Raiz quadrada   || ");
            System.out.println("7. Tabuada         || ");
            System.out.println("8. Media           || ");
            System.out.println("9. Sair            || ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("A opcão escolhida foi: 1. Soma");

                    System.out.println("Digite os numeros a serem somados (0 para encerrar o processo)");
                    double soma = 0;
                    while (true) {

                        double numero = sc.nextDouble();
                        if (numero == 0) {
                            break;
                        }
                        soma += numero;
                    }

                    System.out.printf("A soma é: %.2f%n", soma); // mostra 2 casas decimais
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("A opcão escolhida foi: 2. Subtração");

                    System.out.println("Digite o primeiro numero: ");
                    double numSubtraido = sc.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    double numSubtrator = sc.nextDouble();

                    double subtração = (numSubtraido - numSubtrator);

                    System.out.printf("A subtração é: %.2f%n", subtração); // mostra 2 casas decimais
                    System.out.println(" ");
                    break;

                case 3:

                    System.out.println("A opcão escolhida foi: 3. Multiplicação");

                    System.out.println("Digite o primeiro numero: ");
                    double num1 = sc.nextDouble();

                    System.out.println("Digite o segundo numero: ");
                    double num2 = sc.nextDouble();

                    double multiplicacao = (num1 * num2);

                    System.out.printf("A multiplicação é: %.2f%n", multiplicacao); // mostra 2 casas decimais
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("A opcão escolhida foi: 4. Divisão");

                    System.out.println("Digite o primeiro numero: ");
                    double num1d = sc.nextDouble();

                    System.out.println("Digite o segundo numero: ");
                    double num2d = sc.nextDouble();

                    if (num2d ==0 )
                    {
                        System.out.println("Erro: divisão por zero não é possivel");
                    }
                    else
                    {
                        double divisao = (num1d / num2d);
                        System.out.printf("A divisão é: %.2f%n", divisao); // mostra 2 casas decimais
                        System.out.println(" ");
                    }

                    break;

                case 5:
                    System.out.println("A opção escolhida foi: 5. Potência");
                    System.out.println("Digite o numero da base: ");
                    double basepot = sc.nextDouble();
                    System.out.println("Digite o numero expoente: ");
                    double expoentepot = sc.nextDouble();

                    double potencia = Math.pow(basepot, expoentepot);

                    System.out.println("O resultado da potencia foi: " + potencia);
                    System.out.println(" ");

                    break;

                case 6:
                    System.out.println("A opção escolhida foi: 6. Raiz quadrada");
                    System.out.println("Digite o numero que quer descobrir a raiz quadrada: ");
                    double numRQ = sc.nextDouble();

                    if (numRQ >= 0) {
                        double raiz = Math.sqrt(numRQ);

                        System.out.println("A raiz quadrada de " + numRQ + " é de: " + raiz + "!");

                    }
                    else
                    {
                        System.out.println("Não é possível calcular raiz quadradas negativas!!!");
                    }

                    break;

                case 7:
                    System.out.println("A opção escolhida foi: 7. Tabuada");
                    System.out.println("Digite o numero positivo para saber a tabuada!!!");
                    int numero = sc.nextInt();

                    if (numero <= 0)
                    {
                        System.out.println("Não é possivel realizar tabuada de 0 ou numero negativo!!!");
                    }
                    else {

                        for( int i= 1; i <=10; i++) {
                            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
                        }
                    }
                    break;

                case 8:
                    System.out.println("A opção escolhida foi: 8. Media");
                    System.out.println("Quantos numeros deseja fazer a media?");
                    double somam = 0;
                    int qtd = sc.nextInt();

                    double[] numerosm = new double[qtd];

                    for (int i = 0; i < qtd; i++)
                    {
                        System.out.println("Digite o numero " + (i + 1) + ": ");
                        numerosm[i] = sc.nextDouble();
                        somam += numerosm[i];
                    }
                    double media = somam/numerosm.length;
                    System.out.printf("A média é: %.2f%n" , media);

                    break;

                case 9:
                    System.out.println("Você saiu do programa!!!");
                    return;

                default:
                    System.out.println("Escolha uma opção válida!!!");

            }
            System.out.println("Deseja realizar outra operação? (S/N)");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("N")){
                System.out.println("Você saiu do programa!");
                sc.close();
                break;
            }
            System.out.println();

        }
    }
}