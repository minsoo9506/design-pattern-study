package strategy;

public class DuckDead extends Duck {
    public DuckDead() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
    }

    @Override
    public void display() {
        System.out.println("저는 날지 못하고 울지도 못합니다.");
    }
}
