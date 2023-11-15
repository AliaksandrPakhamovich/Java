package randomExamples;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        // диапазоны
        //для целых чисел
        // (1;4) -> 2,3        ->[2;3] - альтернативная запись для (1,4)
        //[1;4) -> 1,2,3
        // (1;4] -> 2,3,4
        // [1,4] -> 1,2,3,4

        // пример использования Random class
        Random r = new Random(98);

        //boolean значение
        boolean q = r.nextBoolean();

        // int значение
        int w = r.nextInt();   // генерация сл.числа из диапазона Integer
        int e = r.nextInt(10);          // [0;10] == [0;9]
        int t = r.nextInt(7,10); // [7;10) == [7;9]

        // double значение
        double y = r.nextDouble(); // [0;1)
        double u = r.nextDouble(5); // [0;5)
        double i = r.nextDouble(5.5,7.3); // [5.5; 7.3)

        System.out.println(i);
        System.out.println(q);
        System.out.println(e);
    }
}
