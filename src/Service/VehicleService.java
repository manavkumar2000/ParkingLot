package Service;

import Models.Vehicle;
import Repository.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService()
    {
        this.vehicleRepository = new VehicleRepository();
    }
    public void putVehicle(Vehicle vehicle)
    {
        vehicleRepository.put(vehicle);
    }
    public Vehicle getVehicle(String vehicleNumber)
    {
        return vehicleRepository.getVehicle(vehicleNumber);
    }
}
