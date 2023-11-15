package cycleExamples;

public class ForExample3 {
    public static void main(String[] args) {
        int [] a = {1,9,2,8,3,7};
        // idx 0 1 2 3 4 5

        //for-each цикл
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();

        //for-each element * 10
        for (int element : a) {
            System.out.print(element * 10 +  " ");
        }
    }
}
