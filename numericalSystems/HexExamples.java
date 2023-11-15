package numericalSystems;

public class HexExamples {
    public static void main(String[] args) {
        int q = 123;
        // степени 210

        System.out.println(123 / 16);  //7
        System.out.println(123 % 16);  //11  -> B

        System.out.println(7 / 16);  //0
        System.out.println(7 % 16);  //7

        // 7b

        // 16 ->10
        double result1 = 7*Math.pow(16,1) + 11*Math.pow(16,0);
        System.out.println(result1);

        // короткие пути перевода
        // 10 ->16
        System.out.println(Integer.toHexString(q));

        // 16 ->10
        int q16 = 0x7b;
        System.out.println(q16);

    }
}
