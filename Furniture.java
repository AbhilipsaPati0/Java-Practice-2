public class Furniture {
    private String type;
    private double pricePerUnit;
    private int quantity;

    // Constructor
    public Furniture(String type, double pricePerUnit, int quantity) {
        this.type = type;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Method to calculate the total price of the furniture
    public double calculatePrice() {
        return pricePerUnit * quantity;
    }

    // Parameterized method to calculate the price of a specific type of furniture
    public double calculatePrice(String type, double pricePerUnit, int quantity) {
        if (type.equalsIgnoreCase("chair")) {
            return pricePerUnit * quantity * 0.9; // 10% discount for chairs
        } else if (type.equalsIgnoreCase("table")) {
            return pricePerUnit * quantity * 0.8; // 20% discount for tables
        } else if (type.equalsIgnoreCase("bed")) {
            return pricePerUnit * quantity * 0.7; // 30% discount for beds
        } else {
            return pricePerUnit * quantity; // no discount for other types of furniture
        }
    }

    // Method to display the furniture details and price
    public void displayFurnitureDetails() {
        System.out.println("Type: " + type);
        System.out.println("Price per unit: $" + pricePerUnit);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: $" + calculatePrice());
    }

    public static void main(String[] args) {
        Furniture chair = new Furniture("chair", 50.0, 2);
        chair.displayFurnitureDetails();

        Furniture table = new Furniture("table", 100.0, 1);
        table.displayFurnitureDetails();

        Furniture bed = new Furniture("bed", 200.0, 1);
        bed.displayFurnitureDetails();

        // Using the parameterized method to calculate the price of a specific type of furniture
        double sofaPrice = new Furniture("", 0, 0).calculatePrice("sofa", 300.0, 1);
        System.out.println("Price of sofa: $" + sofaPrice);
    }
}