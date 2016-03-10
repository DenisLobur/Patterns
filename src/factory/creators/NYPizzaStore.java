package factory.creators;

import factory.products.*;
import factory.products.newyork.NYStyleCheesePizza;
import factory.products.newyork.NYStyleMarinePizza;
import factory.products.newyork.NYStyleMeetPizza;
import factory.products.newyork.NYStyleSupremePizza;

/**
 * Created by denis on 3/10/16.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(Pizza.PizzaKind kind) {
        switch (kind) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case MARINE:
                return new NYStyleMarinePizza();
            case SUPREME:
                return new NYStyleSupremePizza();
            case MEET:
                return new NYStyleMeetPizza();
            default:
                return null;
        }
    }
}
