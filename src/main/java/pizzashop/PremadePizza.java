package pizzashop;

public enum PremadePizza {
    MEAT_FEAST("Meat Feast"),
    CHEESE_FEAST("Cheese Feast"),
    VEGETABLE_FEAST("Vegetable Feast"),
    MARGARITA("Margarita");

    private String name;

    PremadePizza(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public PremadePizza getPremadePizza(String name){
//
//    }
}
