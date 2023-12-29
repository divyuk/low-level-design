package model;
import java.lang.String;
public class ParkingLot {
    String parkingLotId;
    Address address;
    PaymentCenter paymentCenter;
    ParkingRate parkingRate;
    List<ParkingFloor> parkingFloors = new ArrayList<>();
    List<EntryGate> entryGates = new ArrayList<>();
    List<ExitGate> exitGates = new ArrayList<>();
    List<Ticket> tickets = new ArrayList<>();

    public ParkingLot(Address address) {
        this.parkingLotId = "PL" + System.currentTimeMillis();
        this.address = address;
        this.paymentCenter = new PaymentCenter();
    }

    public boolean isParkingFull(){
        for(ParkingFloor parkingFloor : parkingFloors){
            if(parkingFloor.getAvailableParkingSpot()>0) return false
        }
        return true;
    }
}
