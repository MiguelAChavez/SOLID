package Models;

public class Vehicle {
    protected boolean engineStarted;

    public Vehicle() {
        this.engineStarted = false;
    }

    public void startEngine() {
        this.engineStarted = true;
    }

    public void stopEngine() {
        this.engineStarted = false;
    }

    public void drive() {
        if (!engineStarted) throw new IllegalStateException("El motor no está encendido.");
        System.out.println("Vehículo en movimiento.");
    }

    public boolean isEngineStarted() {
        return this.engineStarted;
    }
}
