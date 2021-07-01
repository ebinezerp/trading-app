package wipro.training.assignmentonemonolithtradingapp.exceptions;

public class InvalidCredentialsException extends RuntimeException {

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String toString() {
        return "Invalid Credentials";
    }
}
