package FactoryPattern;

public class Train implements IVehicleInterface{
    @Override
    public String bookTicket() {
        return "Train Ticket Booked";
    }
}
