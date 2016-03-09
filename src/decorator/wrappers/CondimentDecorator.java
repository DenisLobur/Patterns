package decorator.wrappers;

import decorator.decoratedObj.Beverage;

/**
 * Created by denis on 3/9/16.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
