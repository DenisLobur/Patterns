package factory.creators;

import factory.products.Pizza;

/**
 * Created by denis on 3/10/16.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(Pizza.PizzaKind kind) {
        Pizza pizza;
        pizza = createPizza(kind);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(Pizza.PizzaKind kind);
}
