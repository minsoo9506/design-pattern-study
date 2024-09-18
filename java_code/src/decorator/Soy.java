package decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", 우유";
    }

    public double cost() {
        return this.beverage.cost() + 0.1;
    }
}
