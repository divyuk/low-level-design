package service;

import enums.PaymentMode;
import enums.SpotType;
import enums.VehicleType;
import model.*;

public class DataGeneratorService {

    public Address generateAddress() {
        return new Address(
                "Sample Street",
                "Sample City",
                "Sample State",
                "Sample Country",
                "12345"
        );
    }

    public Vehicle generateVehicle() {
        int pick = getRandomIndex(VehicleType.values().length); // Give length of the Enums values
        VehicleType vehicleType = VehicleType.values()[pick];
        String vehicleNumber = generateRandomLicensePlate();
        return new Vehicle(vehicleType, vehicleNumber);
    }

    public ParkingFloor generateParkingFloor() {
        int spotCount = getRandomNumber(100, 200);
        ParkingFloor parkingFloor = new ParkingFloor(spotCount);
        for (int i = 0; i < spotCount; i++) {
            parkingFloor.addSpot(generateSpot());
        }
        return parkingFloor;
    }

    private Spot generateSpot() {
        int pick = getRandomIndex(SpotType.values().length);
        SpotType spotType = SpotType.values()[pick];
        return new Spot(spotType);
    }


    public PaymentMode generatePaymentMode() {
        int pick = getRandomIndex(PaymentMode.values().length);
        return PaymentMode.values()[pick];
    }


    private int getRandomIndex(int length) {
        return (int) (Math.random() * length);
    }

    private int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private String generateRandomLicensePlate() {
        StringBuilder licensePlate = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            licensePlate.append((char) getRandomNumber(65, 90)); // ASCII values for uppercase letters
        }
        licensePlate.append(getRandomNumber(1000, 9999));
        return licensePlate.toString();
    }
}