package operators;

public class LogicOperators {
    public static void main(String[] args) {
        int q =10;
        int w =20;
        int e =30;
        int r =40;

        System.out.println("q=" + q + ", w=" + w + ", e=" + e +", r=" + r);
        // Логический оператор "И" (&&)
        //                                                   true
        //                                            true    |    true
        //                                              |     |    |
        System.out.println("(q < w) && (e < r): " + ((q < w) && (e < r)));

        //                                                   false
        //                                            true    |   false
        //                                              |     |    |
        System.out.println("(q < w) && (e < r): " + ((q < w) && (e > r)));

        // Логический оператор "ИЛИ" (||)
        //                                                   true
        //                                            true    |    false
        //                                              |     |    |
        System.out.println("(q < w) || (e > r): " + ((q < w) || (e > r)));

        //                                                   false
        //                                            false   |    false
        //                                              |     |    |
        System.out.println("(q > w) || (e > r): " + ((q > w) || (e > r)));

        // Логический оператор НЕ (!)
        //                                            true
        //                                             |         false
        //                                             |  false   |    false
        //                                             |    |     |    |
        System.out.println("!((q < w) || (e < r)): " + !((q > w) || (e > r)));
    }
}
