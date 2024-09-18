package factorymethod;

public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);
        System.out.println("---- " + pizza.getName() +  " 피자를 만듭니다 ----");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
