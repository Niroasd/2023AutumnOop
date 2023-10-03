package main.java.week4;

public class Person {
    private String name;
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double bodyMassIndex() {
        double bmi = this.weight / (this.height * this.height);
        return bmi;
    }

    public void display() {
        System.out.println(String.format("%s, Your bmi is: %f", this.name, bodyMassIndex()));
    }

    public Person(String name) {
        this.name = name;
        this.weight = 0;
        this.height = 0;
    }

    public static void main(String[] args) {
        Person matti = new Person("Matti");
        matti.setHeight(1.8);
        matti.setWeight(86);
        matti.display();
    }
}
