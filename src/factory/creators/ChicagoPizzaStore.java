package factory.creators;

import factory.products.Pizza;
import factory.products.chicago.ChicagoStyleCheesePizza;
import factory.products.chicago.ChicagoStyleMeetPizza;
import factory.products.chicago.ChicagoStyleSupremePizza;

/**
 * Created by denis on 3/10/16.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(Pizza.PizzaKind kind) {
        switch (kind) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case MARINE:
                return new ChicagoStyleCheesePizza();
            case SUPREME:
                return new ChicagoStyleSupremePizza();
            case MEET:
                return new ChicagoStyleMeetPizza();
            default:
                return null;
        }
    }
}
