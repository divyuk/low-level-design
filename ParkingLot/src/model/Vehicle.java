package model;

import enums.VehicleType;

import java.util.UUID;

public class Vehicle {
    String vehicleId;
    VehicleType vehicleType;
    String vehicleNumber;

    public Vehicle(VehicleType vehicleType, String vehicleNumber){
        this.vehicleId = "V-" + UUID.randomUUID();
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

}
