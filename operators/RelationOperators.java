package operators;

public class RelationOperators {
    public static void main(String[] args) {
        int q = 10;
        int w = 20;

        System.out.println("q=" + q + ", w=" + w);
        System.out.println("q > w: " + (q > w));
        System.out.println("q < w: " + (q < w));
        System.out.println("q >= w: " + (q >= w));
        System.out.println("q <= w: " + (q <= w));
        System.out.println("q == w: " + (q == w));
        System.out.println("q != w: " + (q != w));

        boolean qlessW = q < w;
        System.out.println(qlessW);
    }
}
