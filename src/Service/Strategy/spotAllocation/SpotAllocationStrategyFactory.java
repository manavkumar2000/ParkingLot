package Service.Strategy.spotAllocation;

import Exceptions.ParkingSpotNotFoundForVehicleException;

public class SpotAllocationStrategyFactory {

    public static SpotAllocationStrategy getSpotAllocationStrategy(SpotAllocationStrategyTypes spotAllocationStrategyTypes)
    {
        switch(spotAllocationStrategyTypes)
        {
            case LINEAR : return new LinearSpotAllocationStrategy();
        }
        throw new ParkingSpotNotFoundForVehicleException("No Spot Found Exception");
    }

}
