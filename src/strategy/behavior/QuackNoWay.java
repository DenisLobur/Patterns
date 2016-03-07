package strategy.behavior;

/**
 * Created by denis on 3/7/16.
 */
public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Do not quack" + "\n");
    }
}
