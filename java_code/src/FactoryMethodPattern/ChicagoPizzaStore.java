package FactoryMethodPattern;

public class ChicagoPizzaStore extends PizzaStore{
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("hot")) {
            return new ChicagoStyleHotPizza();
        } else return null;
    }
}
