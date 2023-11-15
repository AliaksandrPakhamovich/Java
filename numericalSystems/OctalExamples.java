package numericalSystems;

public class OctalExamples {
    public static void main(String[] args) {
        int q = 123;
        // степени 210

        // 10 -> 8
        System.out.println(123 / 8);    // 15 <- делим его дальше
        System.out.println(123 % 8);    // 3

        System.out.println(15 / 8);    // 1 <- делим его дальше
        System.out.println(15 % 8);    // 7

        System.out.println(1 / 8);    // 0 <- останавливаемся т.к. 0
        System.out.println(1 % 8);    // 1

        // 173 в восьмеричной системе
        // 8 -> 10
        double result1 = 1*Math.pow(8,2) + 7*Math.pow(8,1) + 3*Math.pow(8,0);
        System.out.println(result1);

        // короткие пути перевода
        // 10 -> 8
        System.out.println(Integer.toOctalString(q));

        // 8 -> 10
        int q8 = 0173;
        System.out.println(q8);


    }
}
