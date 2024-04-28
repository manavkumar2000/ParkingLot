package Service.Strategy.billCalculation;

import Models.Bill;
import Models.ParkingTicket;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    public Bill generateBill(ParkingTicket ticket, LocalDateTime localDateTime);
}
