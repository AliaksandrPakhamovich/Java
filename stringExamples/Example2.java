package stringExamples;

public class Example2 {
    public static void main(String[] args) {
        String message = "hello, java. It's 160523-e group";
        // indexes        0123456789

        // длина ч=строки
        int l = message.length();
        System.out.println(l);

        //метод charAt()
        System.out.println(message.charAt(5));

        // метод substring()
        System.out.println(message.substring(5,10));
        System.out.println(message.substring(5));

    }
}
