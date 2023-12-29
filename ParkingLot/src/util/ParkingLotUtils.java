package util;

import enums.SpotType;
import enums.VehicleType;
import model.Spot;
import model.Vehicle;

public class ParkingLotUtils {
    public static boolean isSpotCompatible(Spot spot, Vehicle vehicle) {
        SpotType spotType = spot.getSpotType();
        VehicleType vehicleType = vehicle.getVehicleType();

        switch (spotType) {
            case COMPACT:
                return vehicleType == VehicleType.COMPACT || vehicleType == VehicleType.SEDAN;
            case STANDARD:
                return vehicleType == VehicleType.SEDAN || vehicleType == VehicleType.SUV;
            case LARGE:
                return vehicleType == VehicleType.SUV || vehicleType == VehicleType.TRUCK;
            case MOTORBIKE:
                return vehicleType == VehicleType.MOTORBIKE;
            case ELECTRIC:
                return vehicleType == VehicleType.ELECTRIC;
            case DISABLED:
                return vehicleType == VehicleType.COMPACT || vehicleType == VehicleType.SEDAN || vehicleType == VehicleType.SUV;
            default:
                return false;
        }
    }
}
