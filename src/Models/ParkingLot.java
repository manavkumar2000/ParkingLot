package Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int parkingLotID;
    private ArrayList<ParkingFloor> listOfParkingFloors;
    private ArrayList<ParkingGate> listOfParkingGates;
    private String Address;

    public int getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(int parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public ArrayList<ParkingFloor> getListOfParkingFloors() {
        return listOfParkingFloors;
    }

    public void setListOfParkingFloors(ArrayList<ParkingFloor> listOfParkingFloors) {
        this.listOfParkingFloors = listOfParkingFloors;
    }

    public ArrayList<ParkingGate> getListOfParkingGates() {
        return listOfParkingGates;
    }

    public void setListOfParkingGates(ArrayList<ParkingGate> listOfParkingGates) {
        this.listOfParkingGates = listOfParkingGates;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public ParkingLot(int parkingLotID, ArrayList<ParkingFloor> listOfParkingFloors, ArrayList<ParkingGate> listOfParkingGates, String address) {
        this.parkingLotID = parkingLotID;
        this.listOfParkingFloors = listOfParkingFloors;
        this.listOfParkingGates = listOfParkingGates;
        Address = address;
    }
    public ParkingLot(int parkingLotID, String address) {
        this.parkingLotID = parkingLotID;
        Address = address;
    }
}
