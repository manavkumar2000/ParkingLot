package Service.Strategy.spotAllocation;

import Models.ParkingLot;
import Models.ParkingSpot;
import Models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getParkingSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle);
}
