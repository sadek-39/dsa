package FactoryPattern;

public class GenerateTicket {
    public static void main(String[] args) {
        User user = new User();
        user.buildVehicle(VehicleEnum.VT_TRAIN);
        System.out.println(user.getVehicle().bookTicket());
    }
}
