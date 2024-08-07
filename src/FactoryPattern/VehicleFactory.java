package FactoryPattern;

public class VehicleFactory {
    public static IVehicleInterface build(VehicleEnum vehicleEnum) {
        switch (vehicleEnum) {
            case VT_BUS:
                return new Bus();
            case VT_TRAIN:
                return new Train();
            case VT_AIR:
                // return new Air(); // Placeholder for Air class
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleEnum);
        }
    }
}
