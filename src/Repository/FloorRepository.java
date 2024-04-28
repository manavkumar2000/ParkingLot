package Repository;

import Models.ParkingFloor;


import java.util.HashMap;

public class FloorRepository {

    private static HashMap<Integer, ParkingFloor> ParkingFloorMap = new HashMap<>();
    public void put(ParkingFloor ParkingFloor)
    {
        ParkingFloorMap.put(ParkingFloor.getFloorID(), ParkingFloor);
    }
    public ParkingFloor get(int ID)
    {
        return ParkingFloorMap.get(ID);
    }
}
