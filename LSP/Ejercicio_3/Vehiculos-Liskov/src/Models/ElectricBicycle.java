package Models;

public class ElectricBicycle extends Vehicle {
    private boolean hasBattery;

    public ElectricBicycle(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    @Override
    public void startEngine() {
        if (!hasBattery)
            throw new IllegalStateException("La bicicleta eléctrica no tiene batería.");

        System.out.println("La bicicleta eléctrica está lista para arrancar.");
    }

    @Override
    public void drive() {
        if (!hasBattery)
            throw new IllegalStateException("La bicicleta eléctrica no puede moverse sin batería.");

        System.out.println("La bicicleta eléctrica está siendo conducida.");
    }
}
