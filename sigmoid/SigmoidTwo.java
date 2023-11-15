package sigmoid;
// пример с использованием методов return
public class SigmoidTwo {
    // Sigmoid = S(x) = 1 / (1 + e^(-x))
    // Sigmoid = S(x) = 1 / (1 + e^(neg(x)))
    // Sigmoid = S(x) = 1 / (1 + pow(neg(x)))
    // Sigmoid = S(x) = 1 / (sum(pow(neg(x))))
    // Sigmoid = S(x) = div(sum(pow(neg(x)))))

    private  double result4;

    public SigmoidTwo(double x){
       /* double result1 = neg(x);
        double result2 = pow(result1);
        double result3 = sum(result2);
        double result4 = div(result3);
        */
         result4 = div(sum(pow(neg(x))));

         printResult();
    }

    private double neg(double x) {
        return x * (-1);
    }

    private double pow(double q) {
        return Math.pow(Math.E, q);
    }

    private double sum(double w) {
        return 1 + w;
    }

    private double div(double e) {
        return 1 / e;
    }

    public void printResult() {
        System.out.println("Result SigmoidTwo = " + result4);
    }

    public double getResult4() {
        return result4;
    }
}