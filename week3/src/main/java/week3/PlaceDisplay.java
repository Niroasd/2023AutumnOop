package week3;

import java.util.Scanner;

public class PlaceDisplay extends Place {

    static double cost;

    public PlaceDisplay(String address, int bedrooms, double area) {
        super(address, bedrooms, area);
    }

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        Place koti1 = new Place("kotikatu", 2, 35.0);
        Place koti2 = new Place("loikkakatu", 5, 300.0);
        Place koti3 = new Place("asddfad", 20, 963.2);

        System.out.println("Give " + koti1.address + " price.");
        Double cost = Double.parseDouble(scInput.nextLine());
        System.out.println("the cost per sqm is: " + costPerSqm(koti1, cost));
        System.out.println("the cost per bedroom is: " + costPerBedroom(koti1, cost));

        System.out.println("Give " + koti2.address + " price.");
        cost = Double.parseDouble(scInput.nextLine());
        System.out.println("the cost per sqm is: " + costPerSqm(koti2, cost));
        System.out.println("the cost per bedroom is: " + costPerBedroom(koti2, cost));        

        System.out.println("Give " + koti3.address + " price.");
        cost = Double.parseDouble(scInput.nextLine());
        System.out.println("the cost per sqm is: " + costPerSqm(koti3, cost));
        System.out.println("the cost per bedroom is: " + costPerBedroom(koti3, cost));

        scInput.close();
    }

    public static double costPerSqm(Place koti, Double cost){
        
        Double price = cost/koti.area;
        return price;
    }

    public static double costPerBedroom(Place koti, Double cost){
        Double price = cost/koti.bedrooms;
        return price;
    }
}
