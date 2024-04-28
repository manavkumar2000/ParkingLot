package Models;

import java.util.ArrayList;

public class ParkingFloor {
    private int FloorID;
    private int FloorNumber;
    private ArrayList<ParkingSpot> listOfParkingSpots;
    private static int currentFloorID;

    public ParkingFloor(int floorNumber, ArrayList<ParkingSpot> listOfParkingSpots) {
        this.FloorID = currentFloorID;
        currentFloorID++;
        FloorNumber = floorNumber;
        this.listOfParkingSpots = listOfParkingSpots;
    }
    public ParkingFloor(int floorNumber) {
        this.FloorID = currentFloorID;
        currentFloorID++;
        FloorNumber = floorNumber;
    }

    public ParkingFloor() {
        this.FloorID = currentFloorID;
    }

    public int getFloorID() {
        return FloorID;
    }

    public void setFloorID(int floorID) {
        FloorID = floorID;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public ArrayList<ParkingSpot> getListOfParkingSpots() {
        return listOfParkingSpots;
    }

    public void setListOfParkingSpots(ArrayList<ParkingSpot> listOfParkingSpots) {
        this.listOfParkingSpots = listOfParkingSpots;
    }
}
