package strategy;

public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("날수 없어요.");
    }
}
