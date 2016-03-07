package strategy.behavior;

/**
 * Created by denis on 3/7/16.
 */
public class QuackUsual implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("quack quack!" + "\n");
    }
}
