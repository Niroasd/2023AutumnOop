package week3;

class Apartment extends Place {
    double rent;

    public Apartment(String address, int numberOfBedrooms, double area, double rent) {
        super(address, numberOfBedrooms, area);
        this.rent = rent;
        this.bedrooms = numberOfBedrooms;
    }

    public double rentCost() {
        return rent;
    }
}