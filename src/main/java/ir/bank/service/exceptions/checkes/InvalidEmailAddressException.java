package ir.bank.service.exceptions.checkes;

public class InvalidEmailAddressException extends Exception {
    public InvalidEmailAddressException(String message) {
        super(message);
    }
}
