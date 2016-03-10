package factory.products.newyork;

import factory.products.Pizza;

/**
 * Created by denis on 3/10/16.
 */
public class NYStyleMeetPizza extends Pizza {

    public NYStyleMeetPizza() {
        name = "NY Style meet pork pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano sauce");
    }

    @Override
    public void bake() {
        System.out.println("bake 25 min at 350");
    }

    @Override
    public void cut() {
        System.out.println("cut in diagonal slices");
    }

    @Override
    public void box() {
        System.out.println("put into Meet box");
    }
}
