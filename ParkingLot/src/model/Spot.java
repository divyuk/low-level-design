package model;

import enums.SpotType;

import java.util.UUID;

public class Spot {
    String spotId;
    SpotType spotType;
    boolean isFree;
    Vehicle vehicle;

    public Spot(SpotType spotType){
        this.spotId = "S-" + UUID.randomUUID();
        this.spotType = spotType;
        this.isFree = true;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}
