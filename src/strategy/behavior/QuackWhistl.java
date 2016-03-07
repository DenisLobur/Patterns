package strategy.behavior;

/**
 * Created by denis on 3/7/16.
 */
public class QuackWhistl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Whistle!" + "\n");
    }
}
