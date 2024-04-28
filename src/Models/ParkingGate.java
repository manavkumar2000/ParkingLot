package Models;

public class ParkingGate {
    private int gateID;
    private GateType gateType;

    public ParkingGate(int gateID, GateType gateType) {
        this.gateID = gateID;
        this.gateType = gateType;
    }

    public int getGateID() {
        return gateID;
    }

    public void setGateID(int gateID) {
        this.gateID = gateID;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
