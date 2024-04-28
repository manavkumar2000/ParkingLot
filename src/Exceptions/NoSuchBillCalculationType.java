package Exceptions;

public class NoSuchBillCalculationType extends RuntimeException{
    public NoSuchBillCalculationType(String message) {
        super(message);
    }
}
