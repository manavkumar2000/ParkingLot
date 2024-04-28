import Controller.TicketController;
import Models.ParkingGate;
import Models.ParkingLot;
import Models.ParkingTicket;
import Models.VehicleSpotType;
import Service.Strategy.spotAllocation.SpotAllocationStrategyTypes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing Paring Lot");
        Init in = new Init();
        in.InitializeComponents();
        System.out.println("Initializing Paring Lot Done");
        ParkingLot thisParkingLot = in.getParkingLot();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your Choice");
            System.out.println("1. Enter Parking Lot");
            System.out.println("2. Exit Parking Lot");
            System.out.println("3. Make Floor Unavailable");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    getVehicleDetailsAndAllotSpotToCar(in);
                case 2:
                    getParkingTicketIDAndExitTheCar(in);
                default:
                    System.out.println("Not a correct Choice, try Again");
            }
        }
    }


    private static void getParkingTicketIDAndExitTheCar(Init in) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Ticket ID");

    }

    private static void getVehicleDetailsAndAllotSpotToCar(Init in) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Vehicle Number");
        String vehicleNumber = sc.nextLine();

        System.out.println("Please Enter Vehicle Type");
        int i = 1;
        for(VehicleSpotType vehicleSpotType:VehicleSpotType.values())
        {
            System.out.println(i + ". " + vehicleSpotType);
            i++;
        }
        String vehicleType = sc.nextLine();

        LocalDateTime entryTime = LocalDateTime.now();
        ParkingLot lot = in.getParkingLot();
        //GateController gateController = new GateController();
        ArrayList<ParkingGate> parkingGateArrayList = (ArrayList<ParkingGate>) lot.getListOfParkingGates();
        System.out.println("Please Select gate");
        for(ParkingGate gate:parkingGateArrayList)
        {
            System.out.println(gate.getGateID() + ". "+ gate.getGateType());
        }
        int gateID = sc.nextInt();
        SpotAllocationStrategyTypes spotAllocationStrategyType = SpotAllocationStrategyTypes.LINEAR;
        TicketController ticketController = new TicketController();
        ParkingTicket parkingTicket = ticketController.GenerateTicket(lot, vehicleNumber, VehicleSpotType.valueOf(vehicleType), gateID, spotAllocationStrategyType, entryTime);
        System.out.println("Here is your Parking Ticket: ");
        System.out.println(parkingTicket.toString());

    }
}