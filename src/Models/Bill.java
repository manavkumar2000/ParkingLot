package Models;

import java.time.LocalDateTime;

public class Bill {
    private int billID;
    private LocalDateTime exitTime;
    private ParkingTicket ticket;
    private BillStatus billStatus;
    private ParkingGate exitGate;
    private double amount;
    private static int currentBillID = 0;

    public Bill( LocalDateTime exitTime, ParkingTicket ticket, BillStatus billStatus, ParkingGate exitGate) {
        this.billID = currentBillID;
        this.exitTime = exitTime;
        this.ticket = ticket;
        this.billStatus = billStatus;
        this.exitGate = exitGate;
        currentBillID++;
    }

    public Bill() {
        this.billID = currentBillID;
        currentBillID++;
    }

    public int getBillID() {
        return billID;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public ParkingTicket getTicket() {
        return ticket;
    }

    public void setTicket(ParkingTicket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public ParkingGate getExitGate() {
        return exitGate;
    }

    public void setExitGate(ParkingGate exitGate) {
        this.exitGate = exitGate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
