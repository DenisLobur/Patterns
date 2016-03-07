package strategy.client;

import strategy.behavior.FlyNoWay;
import strategy.behavior.QuackNoWay;

/**
 * Created by denis on 3/7/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm RubberDuck!");
    }
}
