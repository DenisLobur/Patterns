package abstractfactory.client;

import abstractfactory.placefactories.PizzaIngredientFactory;

/**
 * Created by denis on 3/11/16.
 */
public class CheesePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        cheese = pizzaIngredientFactory.createCheese();
    }
}
