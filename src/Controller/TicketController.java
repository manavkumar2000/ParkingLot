package Controller;

import Models.*;
import Repository.TicketRepository;
import Service.GateService;
import Service.Strategy.spotAllocation.SpotAllocationStrategyTypes;
import Service.TicketService;

import java.time.LocalDateTime;

public class TicketController {
private TicketService ticketService;

    public TicketController() {
        this.ticketService = new TicketService();
    }

    public ParkingTicket GenerateTicket(ParkingLot lot, String vehicleNumber, VehicleSpotType vehicleType, int gateID, SpotAllocationStrategyTypes spotAllocationStrategyType, LocalDateTime entryTime) {
        Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType);
        GateService gateService = new GateService();
        ParkingGate gate = gateService.getGate(gateID);
        return ticketService.generateTicket(lot,vehicle,gate,spotAllocationStrategyType,entryTime);
    }
}
