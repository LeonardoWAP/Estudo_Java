package Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0 ){
                System.out.println("divisao impossivel");
            } else{
                double div =(double) a / b;
                System.out.println(div);
            }


        }
        sc.close();
    }
}
