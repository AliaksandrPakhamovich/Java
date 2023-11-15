package ifElseExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        //Например если будет плохая погода - останемя дома, будем смотреть фильм
        //Иначе если погода будет отличная - купим билеты и уедем в другой город на ярмаркую
        //Но если погода будет неоперделенная, тогда встретимся с друзьями в нашем доме.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type of weather ( >0 - good, <0 - bad, 0 - undefined):");
        int type = sc.nextInt();
        sc.close();

        // наиболее прямолинейное решение
       /* if (type < 0)
            System.out.println("останемся дома, будем смотреть фильм");
         else {
            if (type > 0)
                System.out.println("купим билеты и уедем в другой город на ярмарку");
             else
                System.out.println("встретимся с друзьями в нашем доме");}
                */

         // if-else-if ladder
         if (type < 0)
             System.out.println("останемся дома, будем смотреть фильм");
          else if (type > 0)
             System.out.println("купим билеты и уедем в другой город на ярмарку");
          else
             System.out.println("встретимся с друзьями в нашем доме");

    }
}
