package sigmoid;

public class SigmoidInit {
    public static void main(String[] args) {
        // Sigmoid = S(x) = 1 / (1 + e^(-x))
        // умножение, степень, сумма, деление

        double x = 2.5;

        // classic way
        double sigmoid = 1 / (1 + Math.pow(Math.E, (x * (-1))));
        System.out.println(sigmoid);

        // way using void methods
        SigmoidOne s1 = new SigmoidOne(x);

        // way using return methods
        SigmoidTwo s2 = new SigmoidTwo(x);


    }
}
