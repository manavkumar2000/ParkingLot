package Models;

public class Vehicle {
    private String licensePlate;
    private VehicleSpotType vehicleType;

    public Vehicle(String licensePlate, VehicleSpotType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleSpotType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleSpotType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
