package Service;

import Exceptions.wrongParkingGate;
import Models.*;
import Repository.TicketRepository;
import Service.Strategy.spotAllocation.SpotAllocationStrategy;
import Service.Strategy.spotAllocation.SpotAllocationStrategyFactory;
import Service.Strategy.spotAllocation.SpotAllocationStrategyTypes;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;

    public TicketService() {
        this.ticketRepository = new TicketRepository();
    }

    public ParkingTicket getTicket(int TicketID) {
        return ticketRepository.get(TicketID);
    }

    public void putTicket(ParkingTicket ticket) {
        ticketRepository.put(ticket);
    }
    public ParkingTicket generateTicket(ParkingLot parkingLot, Vehicle vehicle, ParkingGate parkingGate, SpotAllocationStrategyTypes spotAllocationStrategyType, LocalDateTime localDateTime)
    {
        if (parkingGate.getGateType().equals(GateType.ENTRY)) {
            VehicleService service = new VehicleService();
            service.putVehicle(vehicle);
            SpotAllocationStrategy spotAllocationStrategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy(spotAllocationStrategyType);
            ParkingSpot spot = spotAllocationStrategy.getParkingSpotForVehicle(parkingLot, vehicle);
            spot.setParkingSpotStatus(ParkingSpotStatus.FILLED);
            ParkingTicket parkingTicket = new ParkingTicket(spot, vehicle, localDateTime, parkingGate);
            putTicket(parkingTicket);
            return parkingTicket;
        }
        throw new wrongParkingGate("You Need to enter from an Entry Gate");

    }
}
