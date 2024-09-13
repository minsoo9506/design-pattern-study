package AbstractFactoryPattern;

import AbstractFactoryPattern.Ingredient.Cheese;
import AbstractFactoryPattern.Ingredient.Dough;
import AbstractFactoryPattern.Ingredient.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
}
