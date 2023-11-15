import com.auto.poland.Car;

public class Second {
    public static void main(String[] args) {
        //  экземпляр №1
      Car q = new Car();

        System.out.println(q.power);
        System.out.println(q.year);
        System.out.println(q.fabric);
        System.out.println(Car.histYear);
        q.printParam();

      System.out.println();

        // экземпляр №2
        Car w = new Car();

        // обновление переменных экземпляра класса
        w.year = 2023;
        w.power = 210;
        w.fabric = "audi";

      // обновление статической переменной
        Car.histYear = 2000;

        System.out.println(w.power);
        System.out.println(w.year);
        System.out.println(w.fabric);
        System.out.println(Car.histYear);
        w.printParam();

    }
}
