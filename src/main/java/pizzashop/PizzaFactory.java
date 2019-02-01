package pizzashop;

import java.util.List;

public class PizzaFactory {

    public Pizza makePreMadePizza(PremadePizza pizzaName) {
        IngredientRegistry ingredientRegistry = new IngredientRegistry();

        Pizza pizza;

        //This entire thing could be improved by applying the Factory pattern and have a specific class for each type of custom pizza
        if(pizzaName.equals(PremadePizza.MARGARITA)){
            pizza = new Pizza();
            pizza.setName(PremadePizza.MARGARITA.getName());
            pizza.addIngredient(ingredientRegistry.getIngredientByName("Mozzarela").get());
            pizza.addIngredient(ingredientRegistry.getIngredientByName("Salami").get());
        }
         else if(pizzaName.equals(PremadePizza.MEAT_FEAST)){
            pizza = new Pizza();
            pizza.setName(PremadePizza.MEAT_FEAST.getName());
            pizza.setIngredients(ingredientRegistry.getIngredientsByType(IngredientType.MEAT));
        }
        else if(pizzaName.equals(PremadePizza.CHEESE_FEAST)){
            pizza = new Pizza();
            pizza.setName(PremadePizza.CHEESE_FEAST.getName());
            pizza.setIngredients(ingredientRegistry.getIngredientsByType(IngredientType.CHEESE));
        }
        else if(pizzaName.equals(PremadePizza.VEGETABLE_FEAST)){
            pizza = new Pizza();
            pizza.setName(PremadePizza.VEGETABLE_FEAST.getName());
            pizza.setIngredients(ingredientRegistry.getIngredientsByType(IngredientType.VEGETABLE));
        }
        else {
            throw new RuntimeException("Unknown Premade Pizza");
        }


        return pizza;
    }

    public Pizza makeCustomPizza(List<Ingredient> ingredients){
        Pizza pizza = new Pizza();
        pizza.setName("Custom Pizza");
        pizza.setIngredients(ingredients);

        return pizza;
    }
}
