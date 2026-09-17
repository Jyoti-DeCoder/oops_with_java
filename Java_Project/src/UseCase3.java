public class UseCase3 {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();

        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);

        System.out.println("Car rent incl. tax: " + (carRent + carRent * Car.TAX_RATE));
        System.out.println("Bike rent incl. tax: " + (bikeRent + bikeRent * Bike.TAX_RATE));
        System.out.println("Total vehicles rented: " + Car.totalVehiclesRented);
    }
}

interface Rentable {
    double calculateRent(int d);
}

class car implements Rentable {
    static int totalVehiclesRented = 0;

    public double calculateRent(int days) {
        totalVehiclesRented++;
        return 1500 * days;
    }
}

class bike implements Rentable {
    public double calculateRent(int days) {
        car.totalVehiclesRented++;
        return 500 * days;
    }
}
