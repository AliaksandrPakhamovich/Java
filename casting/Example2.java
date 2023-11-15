package casting;

public class Example2 {
    public static void main(String[] args) {
        // сужение
        // double -> float -> long -> int -> short -> byte

        byte q = 30;
        int w = 1000;
        double e = 3.123456789123456789;
        System.out.println(e);

// сужение с потерей данных
        float r = (float) e;
        System.out.println(r);

        int y = (int) r;
        System.out.println(y);

// сужение (с потерей данных), неочевидный пример

        long u = 130L;
        byte i = (byte) u;
        System.out.println(i);
    }
}
