package Service;

import Models.Bill;
import Models.BillStatus;

public class PaymentService {
    public PaymentService() {
    }
    public Boolean payBill(Bill bill)
    {
        bill.setBillStatus(BillStatus.PAID);
        return true;
    }
}
