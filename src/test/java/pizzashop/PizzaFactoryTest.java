package pizzashop;

import org.junit.Assert;
import org.junit.Test;

public class PizzaFactoryTest {

    PizzaFactory pizzaFactory = new PizzaFactory();


    @Test
    /**
     * Similar for all the other All* pizzas.
     */
    public void createAllMeatPizza() {
        Pizza pizza = pizzaFactory.makePreMadePizza(PremadePizza.MEAT_FEAST);

        Assert.assertEquals(PremadePizza.MEAT_FEAST.getName(),pizza.getName());

        for(Ingredient ingredient : pizza.getIngredients()){
            Assert.assertEquals(IngredientType.MEAT, ingredient.getType());
        }

        IngredientRegistry ingredientRegistry = new IngredientRegistry();
        Assert.assertEquals(ingredientRegistry.getIngredientsByType(IngredientType.MEAT).size(),pizza.getIngredients().size());
    }
}
