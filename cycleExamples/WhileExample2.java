package cycleExamples;

public class WhileExample2 {
    public static void main(String[] args) {
        int [] a = {1,9,2,8,3,7};

        int q = 0;
        while (q < a.length) {
            System.out.print(a[q] + " ");
            q++;
        }
        System.out.println();

        int w = 0;
        while (w < a.length){
            System.out.print(a[w] * 10 + " ");
            w++;

        }
    }
}
