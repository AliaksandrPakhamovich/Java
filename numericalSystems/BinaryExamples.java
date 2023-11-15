package numericalSystems;

public class BinaryExamples {
    public static void main(String[] args) {
        int q = 123;
        // степени 210

        // 10 -> 2
        System.out.println(123 / 2);  // 61
        System.out.println(123 % 2);  // 1

        System.out.println(61 / 2);  // 30
        System.out.println(61 % 2);  // 1

        System.out.println(30 / 2);  // 15
        System.out.println(30 % 2);  // 0

        System.out.println(15 / 2);  // 7
        System.out.println(15 % 2);  // 1

        System.out.println(7 / 2);  // 3
        System.out.println(7 % 2);  // 1

        System.out.println(3 / 2);  // 1
        System.out.println(3 % 2);  // 1

        System.out.println(1 / 2);  // 0  // остановка расчёта
        System.out.println(1 % 2);  // 1

        // 1111011
        // степени 6543210

        // 2 -> 10
        double result1 = 1*Math.pow(2,6) + 1*Math.pow(2,5) + 1*Math.pow(2,4) + 1*Math.pow(2,3) + 0*Math.pow(2,2) + 1*Math.pow(2,1) + 1*Math.pow(2,0);
        System.out.println(result1);

        // короткие пути перевода
        // 10 -> 2
        System.out.println(Integer.toBinaryString(q));

        // 2 -> 10
        int q2 = 0b1111011;
        System.out.println(q2);

    }
}
