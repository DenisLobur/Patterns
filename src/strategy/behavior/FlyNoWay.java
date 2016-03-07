package strategy.behavior;

/**
 * Created by denis on 3/7/16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("Do not fly" + "\n");
    }
}
