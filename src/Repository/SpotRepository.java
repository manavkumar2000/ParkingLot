package Repository;

import Models.ParkingSpot;


import java.util.HashMap;

public class SpotRepository {

    private HashMap<Integer, ParkingSpot> parkingSpotMap = new HashMap<>();


    public void put(ParkingSpot parkingSpot)
    {
        parkingSpotMap.put(parkingSpot.getParkingSpotID(), parkingSpot);
    }
    public ParkingSpot get(int ID)
    {
        return parkingSpotMap.get(ID);
    }
}
