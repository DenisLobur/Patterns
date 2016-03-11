package abstractfactory.client;

import abstractfactory.ingredients.*;

/**
 * Created by denis on 3/11/16.
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies [] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal pieces");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
