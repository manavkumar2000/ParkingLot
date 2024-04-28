package Service;

import Models.ParkingGate;
import Repository.GateRepository;

public class GateService {
    private GateRepository gateRepository;

    public GateService() {
        this.gateRepository = new GateRepository();
    }
    public void putGate(ParkingGate gate)
    {
        gateRepository.put(gate);
    }
    public ParkingGate getGate(int gateID)
    {
        return gateRepository.get(gateID);
    }
}
