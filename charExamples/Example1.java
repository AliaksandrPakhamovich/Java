package charExamples;

public class Example1 {
    public static void main(String[] args) {
        // пути создания char елементов
        char q = '%';
        char w = 64000;
        char e = '\u00D1';

        System.out.println(q);
        System.out.println(w);
        System.out.println((int) q);
        System.out.println(e);
        System.out.println((int) e);

        // char -> int
        // Способ 1: использование значений ASCII
        char test1 = '9';
        int r = test1;
        System.out.println(r);

        // Способ 2: использование метода value0f() класса String
        char test2 = '9';
        String t = String.valueOf(test2);
        int tt = Integer.parseInt(t);

        System.out.println(tt + 1);

        // Способ 3: использование метода getNumericalValue() класса символов
        char test3 = '9';
        int y = Character.getNumericValue(test3);
        System.out.println(y + 1);


    }
}
