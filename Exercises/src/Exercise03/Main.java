package Exercise03;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        try {
            File documento = new File("Exercises/src/Exercise03/text.txt");
            System.out.println("Caminho absoluto: " + documento.getAbsolutePath());
            Scanner leitor = new Scanner(documento);
            while (leitor.hasNextLine()) {
                String data = leitor.nextLine();
                System.out.println(i + " " + data);
                i++;
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
