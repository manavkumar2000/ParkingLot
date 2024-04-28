package Service;

import Models.ParkingGate;
import Models.ParkingLot;
import Repository.LotRepository;

public class LotService {
    private LotRepository LotRepository;

    public LotService() {
        this.LotRepository = new LotRepository();
    }
    public void putLot(ParkingLot lot)
    {
        LotRepository.put(lot);
    }
    public ParkingLot getGate(int lotID)
    {
        return LotRepository.get(lotID);
    }
}
