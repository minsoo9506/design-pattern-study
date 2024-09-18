package factorymethod;

public class NYStyleHotPizza extends Pizza {

    public NYStyleHotPizza() {
        name = "NY Style hot Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
