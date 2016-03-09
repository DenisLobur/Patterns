package decorator;

import decorator.decoratedObj.Beverage;
import decorator.decoratedObj.Espresso;
import decorator.wrappers.Mocha;
import decorator.wrappers.Whip;

/**
 * Created by denis on 3/9/16.
 */
public class StarBuzzCoffee {

    public static void main(String [] args) {
        Beverage coffee = new Espresso();

        coffee = new Mocha(coffee);
        coffee = new Whip(coffee);

        System.out.print("Total coffee description: " + "\n"
                + coffee.getDescription() + ", only for: "
                + coffee.cost() + " bucks"
        );
    }
}
