package randomExamples;

public class Example2 {
    public static void main(String[] args) {
        // примеры с Math.random()

        double q = Math.random(); // [0;1)
        System.out.println(q);

        // [0;10)
        double w = Math.random() * 10; // [0;1) *10 = [0;10)
        System.out.println(w);

        // [2;10)
        // [0;1) * 8 = [0;8) +2 = [2;10)
        // Math.random() * (max - min) +min
        double e = Math.random() * 8 +2; // [2;10)
        System.out.println(e);

        // [2;10) в целом формате
        int r = (int) (Math.random() * 8 + 2); // [2;10)
        System.out.println(r);
    }
}
