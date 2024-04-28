package Service;

import Models.Bill;
import Models.ParkingSpotStatus;
import Models.ParkingTicket;
import Repository.BillRepository;
import Service.Strategy.billCalculation.BillCalculationStrategy;
import Service.Strategy.billCalculation.BillCalculationStrategyFactory;
import Service.Strategy.billCalculation.BillCalculationType;

import java.time.LocalDateTime;

public class BillService {
    private BillRepository billRepository;

    public BillService()
    {
        this.billRepository = new BillRepository();
    }
    public void putBill(Bill bill)
    {
        billRepository.put(bill);
    }
    public Bill getBill(int billID)
    {
        return billRepository.get(billID);
    }

    public Bill generateBill(ParkingTicket ticket, BillCalculationType calculationType, LocalDateTime localDateTime)
    {
        BillCalculationStrategy billCalculationStrategy = BillCalculationStrategyFactory.getBillCalculationStrategy(calculationType);
        Bill bill = billCalculationStrategy.generateBill(ticket, localDateTime);
        billRepository.put(bill);
        ticket.getParkingSpot().setParkingSpotStatus(ParkingSpotStatus.FREE);
        return  bill;
    }
}
