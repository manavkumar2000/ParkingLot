package Controller;

import Models.Bill;
import Models.ParkingTicket;
import Service.BillService;
import Service.PaymentService;

public class PaymentController {
    private PaymentService paymentService;

    public PaymentController() {
        this.paymentService = new PaymentService();
    }

    public boolean payBill(Bill bill)
    {
        return paymentService.payBill(bill);
    }
}
