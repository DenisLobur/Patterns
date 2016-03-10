package factory;

import factory.creators.ChicagoPizzaStore;
import factory.creators.NYPizzaStore;
import factory.creators.PizzaStore;
import factory.products.Pizza;

/**
 * Created by denis on 3/10/16.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizzaNY = nyStore.orderPizza(Pizza.PizzaKind.MEET);
        Pizza pizzaChic = chicagoStore.orderPizza(Pizza.PizzaKind.SUPREME);

        System.out.println("I just ordered: " + pizzaChic.getName());
        System.out.println("You just ordered: " + pizzaNY.getName());
    }
}
