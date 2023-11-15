package scannerExamples;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // пример работы сканера с дробными числами
        Scanner sc = new Scanner(System.in);

        // площадь крука
        // S = PI*r^2

        System.out.print("Enter pls a radius: ");
        double r = sc.nextDouble();

         double result = 3.14*Math.pow(r,2);
        System.out.println("area = " + result);

        sc.close();

         }

    }

