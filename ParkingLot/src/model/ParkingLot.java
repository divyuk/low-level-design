package model;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String parkingLotId;
    Address address;
    PaymentCenter paymentCenter; // This should be singleton
    ParkingRate parkingRate;
    List<ParkingFloor> parkingFloors = new ArrayList<>();
    List<EntryGate> entryGates = new ArrayList<>();
    List<ExitGate> exitGates = new ArrayList<>();
    List<Ticket> tickets = new ArrayList<>();// Data should not be mixed

    public ParkingLot(Address address) {
        this.parkingLotId = "PL" + System.currentTimeMillis();
        this.address = address;
        this.paymentCenter = new PaymentCenter();
    }

    public Ticket generateTicket(Vehicle vehicle){
        if(isParkingFull()) return null;
        for(ParkingFloor parkingFloor : parkingFloors){
            if(parkingFloor.getAvailableParkingSpot()>0){
                Spot spot = parkingFloor.getAvailableSpotFor(vehicle);
                parkingFloor.parkVehicle(vehicle, spot);
                Ticket ticket = new Ticket(vehicle, spot);
                tickets.add(ticket);
                return ticket;
            }
        }
        return null;
    }

    public PaymentCenter getPaymentCenter(){
        return new PaymentCenter();
    }

    public boolean isParkingFull(){
        for(ParkingFloor parkingFloor : parkingFloors){
            if(parkingFloor.getAvailableParkingSpot()>0) return false;
        }
        return true;
    }

    public void addFloors(int count) {
        for (int j = 0; j < count; j++) {
            parkingFloors.add(new ParkingFloor(100));
        }
    }
    public void addEntryGates(int count) {
        for (int j = 0; j < count; j++) {

            entryGates.add(new EntryGate());
        }
    }

    public void addExitGates(int count) {
        for (int j = 0; j < count; j++) {

            exitGates.add(new ExitGate());
        }
    }
    public void addFloor(ParkingFloor parkingFloor) {
        parkingFloors.add(parkingFloor);
    }
}
