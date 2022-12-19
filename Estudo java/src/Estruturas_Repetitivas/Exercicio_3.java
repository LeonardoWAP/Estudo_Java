package Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // locale US , se tiver como default ele utiliza o locale do PC ai poderia dar erro pois no brasil utilizamos (,) no US usamos (.)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.println(media);
        }


        sc.close();
    }
}
