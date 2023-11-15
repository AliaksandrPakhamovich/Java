import com.auto.finland.Car;

public class Third {
    public static void main(String[] args) {
        // пример конструктора с 3 параметрами
        Car car1 = new Car( 2023, 220, "audi");
        car1.setYear(2050);
        car1.printCar();

        String tmp = car1.getFabric();
        System.out.println(tmp);

/*
        //пример конструктора с 2 параметрами
        Car car2 = new Car(2013,210);

        // пример конструктора с 1 параметрами
        Car car3 = new Car(2003);

        //пример конструктора без параметров
        Car car4 = new Car();
 */
    }
}
