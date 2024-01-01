package de.hu.se.aufgabe3;

public interface TaxVisitor {

    public double calculateTaxFood(ShoppingCart shoppingCart);
    public double calculateTaxLuxury(ShoppingCart shoppingCart);
}
