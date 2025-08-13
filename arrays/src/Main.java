import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//array de nomes

    String[] dados = {"João", "Maria", "Carlos"};
    try{
        //criar ou sobreescrever um arquivo chamado alunos.txt
        FileWriter writer = new FileWriter("alunos.txt");
        //escreve cada nome no arquivo
        for (String nome: dados){
            writer.write(nome + "\n");
        }
        System.out.println("");
    }
    }

}