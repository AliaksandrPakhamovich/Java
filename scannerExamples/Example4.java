package scannerExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // нужно обработать параметры адреса один за другим и напечатать в консоль целиком адрес
        Scanner sc = new Scanner(System.in);

        // 12700
        // Berlin
        // Seestrasse
        // 57
        // Muller

        System.out.print("zip code: ");
        int zip = sc.nextInt();

        sc.nextLine();

        System.out.print("city: ");
        String city = sc.nextLine();

        System.out.print("street: ");
        String street = sc.nextLine();

        System.out.print("home: ");
        int home = sc.nextInt();

        sc.nextLine();

        System.out.print("name: ");
        String name = sc.nextLine();


        System.out.println(zip + ", " + city + ", " + street + " " + home + ", " + name);
        System.out.println(name.charAt(0));


        sc.close();

    }
}
