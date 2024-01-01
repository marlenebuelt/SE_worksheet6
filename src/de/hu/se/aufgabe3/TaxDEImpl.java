package de.hu.se.aufgabe3;
public class TaxDEImpl implements TaxVisitor {

    private double foodTaxRate = 0.07;
    private double luxuryFoodTaxRate = 0.19;

    @Override
    public double calculateTaxFood(ShoppingCart shoppingCart) {
        double tax = 0;
        double foodItemsPrice = shoppingCart.getItems().stream()
                .filter(item -> item instanceof Food)
                .mapToDouble(ShoppingItem::getPrice)
                .sum();
        tax = foodItemsPrice * foodTaxRate;

        return tax;
    }
    @Override
    public double calculateTaxLuxury(ShoppingCart shoppingCart) {
        double tax = 0;
        double foodItemsPrice = shoppingCart.getItems().stream()
                .filter(item -> item instanceof Food)
                .mapToDouble(ShoppingItem::getPrice)
                .sum();
        tax = foodItemsPrice * luxuryFoodTaxRate;

        return tax;
    }
}
