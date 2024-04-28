package Repository;

import java.util.HashMap;
import Models.Vehicle;


public class VehicleRepository {
    private HashMap<String, Vehicle> vehicleMap = new HashMap<>();


    public void put(Vehicle vehicle)
    {
        vehicleMap.put(vehicle.getLicensePlate(), vehicle);
    }
    public Vehicle getVehicle(String LicensePlate)
    {
        return vehicleMap.get(LicensePlate);
    }
}
