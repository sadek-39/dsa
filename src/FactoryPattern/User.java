package FactoryPattern;

public class User {
    private IVehicleInterface vehicle;

    public void buildVehicle(VehicleEnum vehicleEnum) {
        this.vehicle = VehicleFactory.build(vehicleEnum);
    }

    public IVehicleInterface getVehicle() {
        return vehicle;
    }
}
