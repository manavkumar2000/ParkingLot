package Repository;

import Models.ParkingLot;


import java.util.HashMap;

public class LotRepository {

    private HashMap<Integer, ParkingLot> ParkingLotMap = new HashMap<>();
    public void put(ParkingLot ParkingLot)
    {
        ParkingLotMap.put(ParkingLot.getParkingLotID(), ParkingLot);
    }
    public ParkingLot get(int ID)
    {
        return ParkingLotMap.get(ID);
    }
}
