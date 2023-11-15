package switchExamples;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of day in week [1;7]: ");
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Working day");
                break;

            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("error");
    }
    }
}

