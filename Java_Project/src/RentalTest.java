interface Rentable {

    double calculateRent(int days);
}

class Car implements Rentable {

    static int totalVehiclesRented = 0;

    final static double TAX_RATE = 0.05;

    private final double RATE = 1500;

    @Override
    public double calculateRent(int days) {

        totalVehiclesRented++;

        return RATE * days;
    }
}

class Bike implements Rentable {

    private final double RATE = 500;

    @Override
    public double calculateRent(int days) {

        Car.totalVehiclesRented++;

        return RATE * days;
    }
}

public class RentalTest {

    public static void main(String[] args) {

        Rentable car = new Car();
        Rentable bike = new Bike();

        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);

        System.out.println(
                "Car rent incl. tax: " +
                        (carRent + carRent * Car.TAX_RATE));

        System.out.println(
                "Bike rent incl. tax: " +
                        (bikeRent + bikeRent * Car.TAX_RATE));

        System.out.println(
                "Total vehicles rented: " +
                        Car.totalVehiclesRented);
    }
}