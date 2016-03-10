package factory.products.chicago;

import factory.products.Pizza;

/**
 * Created by denis on 3/10/16.
 */
public class ChicagoStyleSupremePizza extends Pizza {

    public ChicagoStyleSupremePizza() {
        name = "Chicago hot pizza";
    }

    @Override
    public void bake() {
        System.out.println("bake for 10 min at 400");
    }

    @Override
    public void cut() {
        System.out.println("cut in squares");
    }

    @Override
    public void box() {
        System.out.println("put into squared box");
    }
}
