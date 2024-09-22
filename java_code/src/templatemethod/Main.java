package templatemethod;

public class Main {
    public static void main(String[] args){
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println(">> Making Coffee...");
        coffee.prepareRecipe();
        System.out.println("\n>> Making tea...");
        tea.prepareRecipe();
    }
}
