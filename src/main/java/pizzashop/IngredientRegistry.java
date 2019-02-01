package pizzashop;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Due to the existence of pizzas that contain all the ingredients of a certain type,
 * one must also consider the scenario in which another ingredient of a certain type is added to the store.
 * In such a case one would not want to recode these types of pizzas.
 *
 * By creating an IngredientRegistry, when a new Ingredient is added, the methods available allow the all of a kind pizzas not to be modified.
 */
public class IngredientRegistry {
    private Set<Ingredient> ingredients;

    public IngredientRegistry() {
        ingredients = new HashSet<Ingredient>();

        ingredients.add(new Ingredient("Salami", IngredientType.MEAT));
        ingredients.add(new Ingredient("Beef", IngredientType.MEAT));
        ingredients.add(new Ingredient("Chicken Breast", IngredientType.MEAT));

        ingredients.add(new Ingredient("Mozzarela", IngredientType.CHEESE));
        ingredients.add(new Ingredient("Feta", IngredientType.CHEESE));
        ingredients.add(new Ingredient("Blue Cheese", IngredientType.CHEESE));

        ingredients.add(new Ingredient("Paprika", IngredientType.VEGETABLE));
        ingredients.add(new Ingredient("Olives", IngredientType.VEGETABLE));
        ingredients.add(new Ingredient("Corn", IngredientType.VEGETABLE));

    }

    public Optional<Ingredient> getIngredientByName(String name) {
        return ingredients.stream().filter(ingredient->name.equals(ingredient.getName())).findFirst();
    }

    /*
        The intention here is to create a construct so that for

     */

    public List<Ingredient> getIngredientsByType(IngredientType type) {
        return ingredients.stream().filter(ingredient->ingredient.getType().equals(type)).collect(Collectors.toList());
    }

}
