package Service.Strategy.billCalculation;

import Models.Bill;
import Models.BillStatus;
import Models.ParkingTicket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class NormalRateBillCalculationStrategy implements BillCalculationStrategy{
    @Override
    public Bill generateBill(ParkingTicket ticket , LocalDateTime localDateTime) {
        Bill bill = new Bill();
        bill.setBillStatus(BillStatus.PENDING);
        bill.setTicket(ticket);
        bill.setExitTime(localDateTime);
        double amount = ChronoUnit.SECONDS.between(ticket.getEntryDateTime(), bill.getExitTime()) * 10;
        bill.setAmount(amount);
        return bill;
    }
}
