package strategy.client;

import strategy.behavior.FlyNoWay;
import strategy.behavior.QuackNoWay;

/**
 * Created by denis on 3/7/16.
 */
public class Swan extends Duck {

    public Swan() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackNoWay();
    }

    @Override
    public void display() {
        System.out.print("I'm swan!" + "\n");
    }
}
