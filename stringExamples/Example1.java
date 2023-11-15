package stringExamples;

public class Example1 {
    public static void main(String[] args) {
        // сравнение типа String как литерал и через ключевое слово new

        // как литерал
        String a = "hello";
        String b = "hello";

        // сравнение обьектов String
        // ==         - сравнение на ссылки
        // .equals()  - сравнение по значению

        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + (a.equals(b)));

        // через ключевое слово new
        String c = new String("java");
        String d = new String("java");

        System.out.println("c == d: " + (c == d));
        System.out.println("a.equals(d): " + (a.equals(d)));
    }
}
