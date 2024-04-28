package Repository;

import Models.Bill;


import java.util.HashMap;

public class BillRepository {

    private HashMap<Integer, Bill> BillMap = new HashMap<>();
    public void put(Bill Bill)
    {
        BillMap.put(Bill.getBillID(), Bill);
    }
    public Bill get(int ID)
    {
        return BillMap.get(ID);
    }
}
