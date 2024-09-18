package abstractfactory;

import abstractfactory.Ingredient.Cheese;
import abstractfactory.Ingredient.Dough;
import abstractfactory.Ingredient.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
