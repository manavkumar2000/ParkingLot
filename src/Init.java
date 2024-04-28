import Models.*;
import Repository.SpotRepository;
import Service.FloorService;
import Service.GateService;
import Service.LotService;
import Service.SpotService;

import java.util.ArrayList;

public class Init {
    /*As we are not having any database we are creating this class
    to initiate Parking lot and its components*/



    private ParkingLot parkingLot;
    public ParkingLot getParkingLot() {
        return parkingLot;
    }
    public void InitializeComponents() {
        SpotService spotService = new SpotService();
        FloorService floorService = new FloorService();
        GateService gateService = new GateService();
        LotService lotService = new LotService();
        parkingLot = new ParkingLot(1, "New Complex, Perungathur, Chennai-63");
        ArrayList<ParkingFloor> parkingFloors = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ParkingFloor floor = new ParkingFloor(i);
            ArrayList<ParkingSpot> listOfParkingSpots = new ArrayList<>();
            for (int j = 1; j <= 100; j++) {
                ParkingSpot spot = getParkingSpot(j, i);
                spotService.putSpot(spot);
                listOfParkingSpots.add(spot);
            }
            floor.setListOfParkingSpots(listOfParkingSpots);
            floorService.putFloor(floor);
            parkingFloors.add(floor);
        }
        parkingLot.setListOfParkingFloors(parkingFloors);

        ParkingGate entryGate = new ParkingGate(1, GateType.ENTRY);
        ParkingGate exitGate = new ParkingGate(2, GateType.EXIT);
        gateService.putGate(entryGate);
        gateService.putGate(exitGate);
        ArrayList<ParkingGate> gates = new ArrayList<>();
        gates.add(entryGate);
        gates.add(exitGate);
        parkingLot.setListOfParkingGates(gates);
        lotService.putLot(parkingLot);

    }

    private static ParkingSpot getParkingSpot(int j, int i) {
        VehicleSpotType vehicleSpotType;
        if (j > 80) {
            vehicleSpotType = VehicleSpotType.LUXURY_CAR;
        } else if (j > 60) {
            vehicleSpotType = VehicleSpotType.CAR;
        } else if (j > 40) {
            vehicleSpotType = VehicleSpotType.CAR;
        } else {
            vehicleSpotType = VehicleSpotType.TWO_WHEELER;
        }
        return new ParkingSpot(i * 1000 + j, vehicleSpotType, ParkingSpotStatus.FREE);
        //return spot;
    }
}
