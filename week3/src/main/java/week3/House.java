package week3;

class House extends Place {
    double mortgageCost;
    double propertyTax;

    public House(String address, int numberOfBedrooms, double area, double mortgageCost, double propertyTax) {
        super(address, numberOfBedrooms, area);
        this.mortgageCost = mortgageCost;
        this.propertyTax = propertyTax;
        this.bedrooms = numberOfBedrooms;
    }

    public double mortgageCostMonthly() {
        return mortgageCost + (propertyTax / 12);
    }
}