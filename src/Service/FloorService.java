package Service;

import Models.ParkingFloor;
import Models.ParkingSpot;
import Models.ParkingSpotStatus;
import Repository.FloorRepository;

import java.util.Arrays;
import java.util.List;

public class FloorService {
    private FloorRepository floorRepository;

    public FloorService() {
        floorRepository = new FloorRepository();
    }
    public ParkingFloor getFloor(int floorID)
    {
        return floorRepository.get(floorID);
    }
    public void putFloor(ParkingFloor floor)
    {
        floorRepository.put(floor);
    }
    public boolean makeFloorOutOfService(int floodID)
    {
        ParkingFloor floor = getFloor(floodID);
        List<ParkingSpot> spotList = floor.getListOfParkingSpots();
        try {
            for(ParkingSpot spot: spotList)
            {
                spot.setParkingSpotStatus(ParkingSpotStatus.OUT_OF_ORDER);
            }
            return true;
        }
        catch (Exception ex)
        {
            return false;
        }

    }
}
