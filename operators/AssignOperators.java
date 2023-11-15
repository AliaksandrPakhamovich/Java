package operators;

public class AssignOperators {
    public static void main(String[] args) {
        // оператор присваивания
        int q = 10;
        //System.out.println(++q);

       // комплексный оператор присваивания
        q = q +1; // ++q или q += 1
        System.out.println(q); // 11
        q += 1; // q = q +1 или ++q
        System.out.println(q); // 12

        q -= 2; // q = q -2
        System.out.println(q); // 10

        // разные комалексные операторы присваивания
        System.out.println(q += 10); // 20; q = q +10
        System.out.println(q -= 5);  // 15; q = q -5
        System.out.println(q *= 3);  // 45; q = q * 3
        System.out.println(q /= 5);  // 9;  q = q / 5
        System.out.println(q %= 8);  // 1   q = q % 8



    }
}
