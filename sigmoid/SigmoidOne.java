package sigmoid;
// пример с использованием void методов
public class SigmoidOne {
    // Sigmoid = S(x) = 1 / (1 + e^(-x))
    // умножение, степень, сумма, деление
    //  neg,  pow, sum, div

    private double result1, result2, result3, result4, x;

    public SigmoidOne(double x) {
        this.x = x;

        neg();
        pow();
        sum();
        div();

        printResult();
    }
    private void neg() {
        result1 = x * (-1);
    }
    private void pow() {
      result2 = Math.pow(Math.E, result1);
    }
    private void sum() {
      result3 = 1 + result2;
    }
    private void div() {
      result4 = 1 / result3;
    }
    public void printResult() {
        System.out.println("Result SigmoidOne = " + result4);
    }
}
