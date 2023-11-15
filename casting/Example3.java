package casting;

public class Example3 {
    public static void main(String[] args) {
        // Преобразования при операциях
        // 1.double
        int q = 1;
        double w =5.0;

         double e = q + w;
        System.out.println(e);

        // 2. float
        int r = 2;
        float t = 3.14f;

        float v = r + t;
        System.out.println(v);

        // 3.long
        byte y = 5;
        long u = 10L;

        long l = y + u;
        System.out.println(l);

        //4. int
        byte i = 10;
        short o = 20;

        int i1 = i + o;
        System.out.println(i1);

        //advanced
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Byte.MAX_VALUE +1);


    }
}
