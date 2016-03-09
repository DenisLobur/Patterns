package decorator.decoratedObj;

/**
 * Created by denis on 3/9/16.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
