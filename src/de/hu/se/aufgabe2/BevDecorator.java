package de.hu.se.aufgabe2;

import java.util.LinkedList;
import java.util.List;

//credit to: https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
public class BevDecorator extends Beverage{
    List <Beverage> bevList = new LinkedList<Beverage>();
    public BevDecorator (List bevList){
        this.bevList=bevList;
    }

    @Override
    public double costs() {
        return bevList.stream()
                .mapToDouble(Beverage::costs)
                .sum();
    }
}
