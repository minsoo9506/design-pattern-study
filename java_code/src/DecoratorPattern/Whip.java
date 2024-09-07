package DecoratorPattern;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", 크림";
    }

    public double cost() {
        return this.beverage.cost() + 0.05;
    }
}
