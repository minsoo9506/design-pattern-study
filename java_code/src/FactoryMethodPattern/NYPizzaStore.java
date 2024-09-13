package FactoryMethodPattern;

public class NYPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("hot")) {
            return new NYStyleHotPizza();
        } else return null;
    }
}
