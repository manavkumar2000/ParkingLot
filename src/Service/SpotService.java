package Service;

import Models.ParkingGate;
import Models.ParkingSpot;
import Repository.SpotRepository;

public class SpotService {
    private SpotRepository SpotRepository;

    public SpotService() {
        this.SpotRepository = new SpotRepository();
    }
    public void putSpot(ParkingSpot spot)
    {
        SpotRepository.put(spot);
    }
    public ParkingSpot getSpot(int spotID)
    {
        return SpotRepository.get(spotID);
    }
}
