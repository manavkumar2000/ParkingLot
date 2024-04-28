import Controller.BillController;
import Controller.PaymentController;
import Controller.TicketController;
import Exceptions.PaymentFailedException;
import Models.*;
import Service.Strategy.billCalculation.BillCalculationType;
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
            //System.out.println("3. Make Floor Unavailable");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    getVehicleDetailsAndAllotSpotToCar(in);
                    break;
                case 2:
                    getParkingTicketIDAndExitTheCar(in);
                    break;
                default:
                    System.out.println("Not a correct Choice, try Again");
                    break;
            }
        }
    }


    private static void getParkingTicketIDAndExitTheCar(Init in) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Ticket ID");
        int ticketID = sc.nextInt();
        LocalDateTime exitTime = LocalDateTime.now();
        BillController billController = new BillController();
        Bill bill = billController.generateBill(ticketID, BillCalculationType.NORMAL, exitTime);
        System.out.println(bill.toString());
        System.out.println("Do you want to pay the bill?(y/n)");
        sc.nextLine();
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("y"))
        {
            PaymentController paymentController = new PaymentController();
            if(paymentController.payBill(bill))
            {
                System.out.println("Payment Successful");
            }
            else {
                throw new PaymentFailedException("Your payment has failed.");
            }
        }
        else
            throw new PaymentFailedException("You cannot deny due payment.");
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