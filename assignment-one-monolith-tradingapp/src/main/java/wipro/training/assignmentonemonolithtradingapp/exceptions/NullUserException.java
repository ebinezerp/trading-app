package wipro.training.assignmentonemonolithtradingapp.exceptions;

public class NullUserException extends RuntimeException {

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String toString() {
        return "user object is null";
    }
}
