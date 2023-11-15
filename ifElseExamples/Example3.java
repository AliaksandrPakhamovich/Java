package ifElseExamples;

public class Example3 {
    public static void main(String[] args) {
        // Например, если у нас будет хорошая погода то мы поедем за город,
        // при этом если останется время - покатаемся на лошади

        boolean goofWeather = true;
        boolean freeTime  = true;

        if (goofWeather) {
            System.out.println("мы поедем за город");

            if (freeTime) {
                System.out.println("покатаемя на лошади");

            }
        }
    }
}
