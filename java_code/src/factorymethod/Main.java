package factorymethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza EthanPizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + EthanPizza.getName() + "\n");

        Pizza JoelPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + JoelPizza.getName() + "\n");
    }
}
