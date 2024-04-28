package Controller;

import Models.Bill;
import Models.ParkingTicket;
import Service.BillService;
import Service.Strategy.billCalculation.BillCalculationType;
import Service.TicketService;

import java.time.LocalDateTime;

public class BillController {
    private BillService billService;

    public BillController() {
        this.billService = new BillService();
    }
    public Bill generateBill(int ticketID, BillCalculationType billCalculationType, LocalDateTime exitTime)
    {
        TicketService ticketService = new TicketService();
        ParkingTicket ticket = ticketService.getTicket(ticketID);
        return billService.generateBill(ticket, billCalculationType, exitTime);
    }
}
