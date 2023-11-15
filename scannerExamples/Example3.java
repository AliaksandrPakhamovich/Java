package scannerExamples;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls your name: ");
        String name = sc.nextLine();

        System.out.println("hello " + name);

        sc.close();
    }
}
