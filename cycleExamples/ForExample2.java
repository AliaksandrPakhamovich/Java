package cycleExamples;

public class ForExample2 {
    public static void main(String[] args) {
        int [] a = {1,9,2,8,3,7};
        // idx 0 1 2 3 4 5
        System.out.println(a.length);

        //вывод всех элементов массива
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //вывод всех элементов *10
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] * 10 + " ");
        }
    }
}
