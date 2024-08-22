package StrategyPattern;

public class Main {
    public static void main(String[] args){
        Duck duckActive = new DuckActive();
        duckActive.performFly();
        duckActive.performQuack();
        duckActive.display();

        Duck duckDead = new DuckDead();
        duckDead.performFly();
        duckDead.performQuack();
        duckDead.display();
    }
}
