package Exceptions;

public class wrongParkingGate extends RuntimeException{
    public wrongParkingGate(String message) {
        super(message);
    }
}
