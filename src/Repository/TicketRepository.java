package Repository;

import Models.ParkingTicket;


import java.util.HashMap;

public class TicketRepository {

    private static HashMap<Integer, ParkingTicket> parkingTicketMap = new HashMap<>();;

    public void put(ParkingTicket parkingTicket)
    {
        parkingTicketMap.put(parkingTicket.getParkingTicketID(), parkingTicket);
    }
    public ParkingTicket get(int ID)
    {
        return parkingTicketMap.get(ID);
    }
}
