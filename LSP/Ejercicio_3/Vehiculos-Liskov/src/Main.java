import Models.Bicycle;
import Models.Car;
import Models.ElectricBicycle;
import Models.Vehicle;

public class Main {
    public static void main(String[] args) {
        test(new Vehicle());
        test(new Car(100));
        test(new ElectricBicycle(true));
        test(new Bicycle(false));
    }

    private static void test(Vehicle v) {
        try {
            v.startEngine();
            v.drive();
            v.stopEngine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}