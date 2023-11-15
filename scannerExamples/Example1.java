package scannerExamples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls value for A: ");
        int a = sc.nextInt();

        System.out.println("Enter pls value for B:");
        int b = sc.nextInt();

        System.out.println(a + b);

        sc.close();
    }
}
