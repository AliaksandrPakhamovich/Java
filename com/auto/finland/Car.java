package com.auto.finland;

public class Car {
        private int year;
        private int power;
        private String fabric;



    public Car(int year, int power, String fabric) {
        this(year, power);
        this.fabric = fabric;

        printCar ();
        System.out.println("3 args");
        System.out.println();
    }
        public Car(int year, int power) {
        this(year);
        this.power = power;
        fabric = "vw";

            printCar ();
            System.out.println("2 args");
            System.out.println();

        }
    public Car(int year) {
        this();
        this.year = year;
        power = 100;
        fabric ="vw";

        printCar ();
        System.out.println("1 args");
        System.out.println();
    }
    public Car() {
        year = 1993;
        power = 100;
        fabric = "vw";

        printCar ();
        System.out.println("0 args");
        System.out.println();
    }
    public void printCar () {
        System.out.println("year = " + year + " power = " + power + " fabric = " + fabric);

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
