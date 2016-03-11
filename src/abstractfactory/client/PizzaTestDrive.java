package abstractfactory.client;

/**
 * Created by denis on 3/11/16.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.createPizza("Cheese");

    }
}
