package adapter;

public class Main {
    public static void main(String[] args){
        PrettyDuck prettyDuck = new PrettyDuck();
        Turkey duckAdapter = new DuckAdapter(prettyDuck);

        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
