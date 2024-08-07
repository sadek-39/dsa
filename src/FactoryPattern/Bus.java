package FactoryPattern;

public class Bus implements IVehicleInterface{
    @Override
    public String bookTicket() {
        return "Bus Ticket Booked";
    }
}
