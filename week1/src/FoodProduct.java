public class FoodProduct {
    private String type;
    private Double weight;
    private Double cost;
    private Integer servings;
    private Double caloriesperserving;

    public void display() {
        System.out.println(type);
        System.out.println(weight);
        System.out.println(cost);
        System.out.println(servings);
        System.out.printf("%.1f", caloriesperserving);
        System.out.println();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = !type.isEmpty() ? type : "fallback value";
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight >= 0 ? weight : -1;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getServings() {
        return this.servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public Double getCaloriesperserving() {
        return this.caloriesperserving;
    }

    public void setCaloriesperserving(Double caloriesperserving) {
        this.caloriesperserving = caloriesperserving;
    }

}
