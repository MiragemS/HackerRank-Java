package Exercise03;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File documento = new File("Exercise03/doc.txt");
            Scanner leitor = new Scanner(documento);
            while (leitor.hasNextLine()) {
                String data = leitor.nextLine();
                System.out.println(data);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
