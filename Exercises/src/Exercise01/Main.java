package Exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        String[] valores;
        List<int[]> sepValores = new ArrayList<>();

        for(int i  = 1; i <= q; i++){
            valores = sc.nextLine().split(" ");
            sepValores.add(new int[]{Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), Integer.parseInt(valores[2])});

        }

        for(int[] queue : sepValores){
            int resultado = 0;
            for(int i = 0; i < queue[2]; i++){
                resultado+=Math.pow(2, i)*queue[1];
                System.out.print((queue[0]+resultado) + " ");
            }
            System.out.println("");
        }
    }
}
