package Estruturas_Condicionais;

import java.util.Scanner;
// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 0){
            System.out.println("numero negativo");
        }
        else{
            System.out.println("numero Positivo");
        }
    }
}



