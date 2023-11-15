package cycleExamples;

public class DoWhileExample2 {
    public static void main(String[] args) {
        int [] a = {1,9,2,8,3,7};

        int q = 0;

        do {
            System.out.print(a[q] + " ");
            q++;
        }while (q < a.length);
    }
}
