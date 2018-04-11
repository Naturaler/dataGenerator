package com.rx.datagenerator.design.decorator;

/**
 * Created by r.x on 2018/4/10.
 */
public class Starbucks {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        coffee = new Cheese(coffee);
        coffee = new Honey(coffee);
        System.out.println(coffee.description());
        System.out.println(coffee.cost());

        Drink tea = new Tea();
        tea = new Cheese(tea);
        System.out.println(tea.description());
        System.out.println(tea.cost());

        Drink superCoffee = new Coffee();
        superCoffee = new Cheese(superCoffee);
        superCoffee = new Cheese(superCoffee);
        superCoffee = new Honey(superCoffee);
        superCoffee = new Honey(superCoffee);
        superCoffee = new Cheese(superCoffee);
        System.out.println(superCoffee.description());
        System.out.println(superCoffee.cost());
    }
}
