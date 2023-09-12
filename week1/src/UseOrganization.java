public class UseOrganization {
    public static void main(String[] args) {
        var lidl = new Organization();
        var wwf = new Organization();

        lidl.name = "Lidl";
        lidl.revenue = 23523495.23456;
        lidl.profit = true;

        wwf.name = "WWF";
        wwf.revenue = 123.1564;
        wwf.profit = false;

        lidl.displayDetails();
        wwf.displayDetails();

    }
}
