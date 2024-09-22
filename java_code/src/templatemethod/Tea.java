package templatemethod;

public class Tea extends Beverage{
    public void brew() {
        System.out.println("Brewing Tea");
    }

    public void addCondiments() {
        System.out.println("Adding Nothing");
    }
}
