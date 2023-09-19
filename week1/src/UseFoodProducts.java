public class UseFoodProducts {

    public static void main(String[] args) {
        var Mango = new FoodProduct();
        var Watermelon = new FoodProduct();

        Mango.setType("Mango whole");
        Mango.setCost(0.32);
        Mango.setServings(4);
        Mango.setWeight(-2.0);
        Mango.setCaloriesperserving(28.42);

        Watermelon.setType("");
        Watermelon.setCost(1.30);
        Watermelon.setServings(1);
        Watermelon.setWeight(400.1);
        Watermelon.setCaloriesperserving(1.2345);

        Mango.display();
        Watermelon.display();
    }
}
