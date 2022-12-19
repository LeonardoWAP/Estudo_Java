package Estruturas_Repetitivas;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<=x; i++) {
            int numero_linha = i;
            int quadrado = i*i;
            int cubo = i*i*i;
            System.out.println("numero da linha ="+ numero_linha);
            System.out.println("numero quadrado ="+ quadrado);
            System.out.println("numero cubo =" + cubo);
        }
        sc.close();
    }
}
