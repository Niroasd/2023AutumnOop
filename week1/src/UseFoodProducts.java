public class UseFoodProducts {

    public static void main(String[] args) {
        var Mango = new FoodProduct();
        var Watermelon = new FoodProduct();

        Mango.type = "Mango whole";
        Mango.cost = 0.32;
        Mango.servings = 4;
        Mango.weight = 72.1;
        Mango.caloriesperserving = 28.42;

        Watermelon.type = "sliced melon";
        Watermelon.cost = 1.30;
        Watermelon.servings = 1;
        Watermelon.weight = 400.1;
        Watermelon.caloriesperserving = 1.2345;

        Mango.display();
        Watermelon.display();
    }
}
