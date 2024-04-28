package Models;

import java.time.LocalDateTime;

public class ParkingTicket {
    private int parkingTicketID;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime entryDateTime;
    private ParkingGate entryGate;

    private static int currentParkingID = 1;

    public ParkingTicket(ParkingSpot parkingSpot, Vehicle vehicle, LocalDateTime entryDateTime, ParkingGate entryGate) {
        this.parkingTicketID = currentParkingID;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.entryDateTime = entryDateTime;
        this.entryGate = entryGate;
        currentParkingID++;
    }

    public ParkingTicket() {
        this.parkingTicketID = currentParkingID;
        currentParkingID++;
    }

    public int getParkingTicketID() {
        return parkingTicketID;
    }

    public void setParkingTicketID(int parkingTicketID) {
        this.parkingTicketID = parkingTicketID;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(LocalDateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public ParkingGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(ParkingGate entryGate) {
        this.entryGate = entryGate;
    }

    @Override
    public String toString() {
        return "Ticket ID: "  + parkingTicketID + "\n"
                + "Vehicle Number: " + vehicle.getLicensePlate() +"\n"
                + "Entry Time: " + entryDateTime.toString();
    }
}
