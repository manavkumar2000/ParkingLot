package Models;

public class ParkingSpot {
    private  int parkingSpotID;
    private VehicleSpotType parkingSpotType;
    private ParkingSpotStatus parkingSpotStatus;

    public ParkingSpot(int parkingSpotID, VehicleSpotType parkingSpotType, ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotID = parkingSpotID;
        this.parkingSpotType = parkingSpotType;
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getParkingSpotID() {
        return parkingSpotID;
    }

    public void setParkingSpotID(int parkingSpotID) {
        this.parkingSpotID = parkingSpotID;
    }

    public VehicleSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(VehicleSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
