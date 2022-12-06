package Estruturas_Condicionais;

import java.util.Scanner;
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Hinicial = sc.nextInt();
        int Hfinal = sc.nextInt();

        int duracao;

        if (Hinicial < Hfinal){
            duracao = Hfinal - Hinicial;
        }
        else{
            duracao = 24 - Hinicial + Hfinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
