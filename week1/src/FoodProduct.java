public class FoodProduct {
    String type;
    Double weight;
    Double cost;
    Integer servings;
    Double caloriesperserving;

    public void display() {
        System.out.println(type);
        System.out.println(weight);
        System.out.println(cost);
        System.out.println(servings);
        System.out.printf("%.1f", caloriesperserving);
    }

}
