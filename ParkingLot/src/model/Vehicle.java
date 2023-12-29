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

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }



}
