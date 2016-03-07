package strategy.behavior;

/**
 * Created by denis on 3/7/16.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("Fly with wings" + "\n");
    }
}
