package Models;

public class Car extends Vehicle {
    private int fuelLevel;

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        if (this.fuelLevel <= 0)
            throw new IllegalStateException("No hay combustible suficiente para encender el motor.");
        System.out.println("El motor del coche se ha encendido, combustible restante: " + this.fuelLevel);
        super.startEngine();
    }

    @Override
    public void drive() {
        if (this.fuelLevel <= 0)
            throw new IllegalStateException("No hay combustible suficiente para moverse.");
        super.drive();
        this.fuelLevel--;
        System.out.println("Combustible restante: " + this.fuelLevel);
    }

    public void refuel(int amount) {
        this.fuelLevel += amount;
    }
}
