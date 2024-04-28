package Service.Strategy.spotAllocation;

import Exceptions.ParkingSpotNotFoundForVehicleException;
import Models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot getParkingSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        ArrayList<ParkingFloor> parkingFloors = parkingLot.getListOfParkingFloors();

        for(ParkingFloor floor:parkingFloors)
        {
            ArrayList<ParkingSpot> parkingSpots = floor.getListOfParkingSpots();
            for(ParkingSpot spot: parkingSpots)
            {
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.FREE) && vehicle.getVehicleType().equals(spot.getParkingSpotType()))
                {
                    return spot;
                }
            }
        }
        throw new ParkingSpotNotFoundForVehicleException("Please go home, eat and sleep");
    }
}
