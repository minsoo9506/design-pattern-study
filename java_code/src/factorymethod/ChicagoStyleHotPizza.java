package factorymethod;

public class ChicagoStyleHotPizza extends Pizza {

    public ChicagoStyleHotPizza() {
        name = "Chicago Style hot Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
