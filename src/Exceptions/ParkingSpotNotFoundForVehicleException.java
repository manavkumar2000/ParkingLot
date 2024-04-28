package Exceptions;

public class ParkingSpotNotFoundForVehicleException extends RuntimeException{
    public ParkingSpotNotFoundForVehicleException(String message) {
        super(message);
    }
}
