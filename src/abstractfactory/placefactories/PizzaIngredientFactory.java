package abstractfactory.placefactories;

import abstractfactory.ingredients.*;

/**
 * Created by denis on 3/10/16.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies [] createVegies();
    Pepperoni createPepperoni();
    Clams createClams();
}
