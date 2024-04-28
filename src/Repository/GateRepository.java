package Repository;

import Models.ParkingGate;


import java.util.HashMap;

public class GateRepository {

    private static HashMap<Integer, ParkingGate> ParkingGateMap = new HashMap<>();
    public void put(ParkingGate ParkingGate)
    {
        ParkingGateMap.put(ParkingGate.getGateID(), ParkingGate);
    }
    public ParkingGate get(int ID)
    {
        return ParkingGateMap.get(ID);
    }
}
