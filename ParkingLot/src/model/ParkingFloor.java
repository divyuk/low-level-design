package model;

import java.util.ArrayList;
import java.util.List;

import static util.ParkingLotUtils.isSpotCompatible;

public class ParkingFloor {
    int floorId;
    List<Spot> spots = new ArrayList<>();
    int availableParkingSpot;
    int totalParkingSpot;
    int occupiedParkingSpots;

    public ParkingFloor(int totalParkingSpot){
        this.totalParkingSpot = totalParkingSpot;
        this.availableParkingSpot = totalParkingSpot;
        this.occupiedParkingSpots = 0;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    public int getAvailableParkingSpot() {
        return availableParkingSpot;
    }

    public void setAvailableParkingSpot(int availableParkingSpot) {
        this.availableParkingSpot = availableParkingSpot;
    }

    public int getTotalParkingSpot() {
        return totalParkingSpot;
    }

    public void setTotalParkingSpot(int totalParkingSpot) {
        this.totalParkingSpot = totalParkingSpot;
    }

    public int getOccupiedParkingSpots() {
        return occupiedParkingSpots;
    }

    public void setOccupiedParkingSpots(int occupiedParkingSpots) {
        this.occupiedParkingSpots = occupiedParkingSpots;
    }


    public Spot getAvailableSpotFor(Vehicle vehicle){
        for(Spot spot : spots){
            if(spot.isFree() && isSpotCompatible(spot, vehicle) ) return  spot;
        }
        return null;
    }

    public void parkVehicle(Vehicle vehicle, Spot spot){
        spot.setVehicle(vehicle);
        spot.setFree(false);
        this.availableParkingSpot--;
        this.occupiedParkingSpots++;
    }

    public void addSpot(Spot spot){
        spots.add(spot);
    }
}
