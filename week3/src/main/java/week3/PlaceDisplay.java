package week3;

import java.util.Scanner;

public class PlaceDisplay extends Place {

    static double cost;

    public PlaceDisplay(String address, int bedrooms, double area) {
        super(address, bedrooms, area);
    }

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        // Place koti1 = new Place("kotikatu", 2, 35.0);
        // Place koti2 = new Place("loikkakatu", 5, 300.0);
        // Place koti3 = new Place("asddfad", 20, 963.2);

        // System.out.println("Give " + koti1.address + " price.");
        // Double cost = Double.parseDouble(scInput.nextLine());
        // System.out.println("the cost per sqm is: " + costPerSqm(koti1, cost));
        // System.out.println("the cost per bedroom is: " + costPerBedroom(koti1,
        // cost));

        // System.out.println("Give " + koti2.address + " price.");
        // cost = Double.parseDouble(scInput.nextLine());
        // System.out.println("the cost per sqm is: " + costPerSqm(koti2, cost));
        // System.out.println("the cost per bedroom is: " + costPerBedroom(koti2,
        // cost));

        // System.out.println("Give " + koti3.address + " price.");
        // cost = Double.parseDouble(scInput.nextLine());
        // System.out.println("the cost per sqm is: " + costPerSqm(koti3, cost));
        // System.out.println("the cost per bedroom is: " + costPerBedroom(koti3,
        // cost));

        House koti4 = new House("lokkikuja", 8, 300, 450000, 999999);
        Apartment koti5 = new Apartment("Rotankolontie 248", 2, 80, 1690);

        scInput.close();

        apartmentCostSqm(koti5, koti5.rent);
        houseCostSqm(koti4, koti4.mortgageCostMonthly());
        // double costPerBedroom = koti4.calculateCostPerBedroom(totalMonthlyCostHouse);

        // double costPerSqFtApartment =
        // koti5.calculateCostPerSquareFoot(totalMonthlyCostApartment);
        // double costPerBedroomApartment =
        // koti5.calculateCostPerBedroom(totalMonthlyCostApartment);

    }

    public static void houseCostSqm(House koti, Double cost) {

        Double price = cost / koti.area;
        Double costPerBedroom = cost / koti.bedrooms;
        System.out.println(koti.address + " costs " + price + " per squaremeter per month\n");
        System.out.println(koti.address + " price per bedroom is: " + costPerBedroom + " per month\n");
    }

    public static void apartmentCostSqm(Apartment koti, Double cost) {

        Double price = cost / koti.area;
        Double costPerBedroom = cost / koti.bedrooms;
        System.out.println(koti.address + " costs " + price + " per squaremeter per month\n");
        System.out.println(koti.address + " price per bedroom is: " + costPerBedroom + " per month\n");
    }

    public static double costPerSqm(Place koti, Double cost) {

        Double price = cost / koti.area;
        return price;
    }

    public static double costPerBedroom(Place koti, Double cost) {
        Double price = cost / koti.bedrooms;
        return price;
    }
}
