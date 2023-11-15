package operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int q = 123;
        System.out.println(q);

        int w = ~q;
        System.out.println(w);
    }
    public static void getExample4(){
        int q = 10;
        System.out.println(q);  // 10
        System.out.println(q++);// 10
        System.out.println(q--);// 11

    }

    public static void getExample3() {
        // пример использования унарных операторов (префиксной формы)
        // в качестве аргумента метода
        int q = 10;
        System.out.println(q);  // 10
        System.out.println(++q);// 11
        System.out.println(--q);// 10
    }

    public static void getExample2() {
        int q = 10;
        System.out.println(q);  // 10
        q++;    // q = q + 1, унарный оператор в постфиксной форме, инкремент
        System.out.println(q);  // 11
        q--;    // q = q - 1, унарный оператор в постфиксной форме, декремент
        System.out.println(q);  // 10
    }

    public static void getExample1() {
        int q = 10;
        System.out.println(q);  // 10
        ++q;      // q = q + 1, унарный оператор в префиксной форме, инкремент
        System.out.println(q);  // 11
        --q;      // q = q - 1, унарный оператор в префиксной форме, декремент
        System.out.println(q);  // 10
    }
}
