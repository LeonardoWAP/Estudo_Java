package Estruturas_Condicionais;

import java.util.Scanner;
//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        if (a%b == 0 || b%a ==0){
            System.out.println("são multiplos");
        }
        else{
            System.out.println("não são multiplos");
        }
    }
}
