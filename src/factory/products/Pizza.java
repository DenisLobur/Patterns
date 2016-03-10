package factory.products;

import java.util.ArrayList;

/**
 * Created by denis on 3/10/16.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public enum PizzaKind {
        CHEESE, MARINE, MEET, SUPREME
    }

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: ");
        for (String top : toppings) {
            System.out.println(top);
        }
    }

    public String getName() {
        return name;
    }
}
