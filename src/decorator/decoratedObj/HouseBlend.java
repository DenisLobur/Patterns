package decorator.decoratedObj;

/**
 * Created by denis on 3/9/16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
