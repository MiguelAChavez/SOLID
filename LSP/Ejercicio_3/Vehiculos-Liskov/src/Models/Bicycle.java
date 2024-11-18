package Models;

public class Bicycle extends Vehicle {
    private boolean hasPedals;

    public Bicycle(boolean hasPedals) {
        this.hasPedals = hasPedals;
    }

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Las bicicletas no tienen motor.");
    }

    @Override
    public void drive() {
        if (!hasPedals)
            throw new IllegalStateException("La bicicleta no tiene pedales y no puede ser conducida.");

        System.out.println("La bicicleta está siendo pedaleada.");
    }
}
