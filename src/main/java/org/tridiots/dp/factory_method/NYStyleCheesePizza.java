package org.tridiots.dp.factory_method;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
