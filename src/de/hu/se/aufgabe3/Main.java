package de.hu.se.aufgabe3;

public class Main {
    public static void main(String[] args) {
        Food food = new Food(1);
        LuxuryFood luxuryFood = new LuxuryFood(1);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(food);
        shoppingCart.addItem(luxuryFood);

        TaxDEImpl de = new TaxDEImpl();
        TaxITImpl it = new TaxITImpl();

        System.out.print(de.calculateTaxFood(shoppingCart));
        System.out.print(de.calculateTaxLuxury(shoppingCart));

        System.out.print(it.calculateTaxFood(shoppingCart));
        System.out.print(it.calculateTaxLuxury(shoppingCart));

    }
}
