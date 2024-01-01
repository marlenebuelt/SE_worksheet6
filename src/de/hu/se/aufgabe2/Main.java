package de.hu.se.aufgabe2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Milk m = new Milk();
        Coffee coffee = new Coffee();
        SoyMilk soyMilk = new SoyMilk();
        Beverage b = new BevDecorator(List.of(m,coffee, soyMilk));
        System.out.print(b.costs());
    }
}
