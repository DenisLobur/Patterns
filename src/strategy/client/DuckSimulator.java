package strategy.client;

import strategy.behavior.FlyWithWings;
import strategy.behavior.QuackWhistl;

/**
 * Created by denis on 3/7/16.
 */
public class DuckSimulator {

    public static void main(String [] args) {
        Duck rubberDuck = new Swan();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.setQuackBehavior(new QuackWhistl());

        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
