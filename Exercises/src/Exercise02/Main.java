package Exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++){
            try{
                long num = sc.nextLong();
                System.out.println(num + " can be fitted in: ");

                if(num >= -128 && num <= 127) System.out.println("* byte");
                if(num >= -32768 && num <= 32767) System.out.println("* short");
                if(num >= Math.pow(-2, 31) && num <= Math.pow(2, 31)-1) System.out.println("* int");
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
