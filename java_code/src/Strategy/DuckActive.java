package Strategy;

public class DuckActive extends Duck{
    public DuckActive() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackLoud();
    }

    @Override
    public void display() {
        System.out.println("저는 날수도 있고 시끄러운 오리입니다.");
    }
}
