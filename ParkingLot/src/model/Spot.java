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
}
