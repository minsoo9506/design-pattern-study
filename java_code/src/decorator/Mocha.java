package decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", 모카";
    }

    public double cost() {
        return this.beverage.cost() + 0.02;
    }
}
