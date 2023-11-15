package cycleExamples;

public class ForExample1 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("hello java " + i);}
        // iter.1: i=0; i<3 => true; "hello java"; i = i + 1
        // iter.2: i=1; i<3 => true; "hello java"; i = i + 1
        // iter.3: i=2; i<3 => true; "hello java"; i = i + 1
        // iter.4: i=3; i<3 => false;
    }
}
