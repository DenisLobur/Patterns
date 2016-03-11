package abstractfactory.client;

import abstractfactory.placefactories.NYPizzaIngredientFactory;
import abstractfactory.placefactories.PizzaIngredientFactory;

/**
 * Created by denis on 3/11/16.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("Cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York style cheese pizza");
            pizza.prepare();
        }
        return pizza;
    }
}
