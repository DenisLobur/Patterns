package abstractfactory.client;

/**
 * Created by denis on 3/11/16.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String item);
}
