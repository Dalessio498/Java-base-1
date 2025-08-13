import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] media = new float[5];

        for (int i=0; i<media.length;i++){
            System.out.println("nota" + (i+1) + ": ");
            media[1] = scanner.nextFloat();

        }
        float j = (media[0] + media[1] + media[2] + media[3] + media[4]) / 5;
        System.out.println("media: " + j);
    }
}