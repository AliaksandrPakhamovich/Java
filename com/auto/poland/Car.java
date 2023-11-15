package com.auto.poland;

public class Car {

    // переменные экземпляра
    public int year;

    public int power;

    public String fabric;

    // статическая переменная
    public static int histYear = 1997;

    public void printParam() {
        // пример локальной переменной
        String message = "Car year: " + year + ", power: " + power +", fabric: " + fabric;
        System.out.println(message);
    }

}
