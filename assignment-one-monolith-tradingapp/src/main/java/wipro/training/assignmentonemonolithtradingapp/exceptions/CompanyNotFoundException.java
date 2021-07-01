package wipro.training.assignmentonemonolithtradingapp.exceptions;

public class CompanyNotFoundException extends RuntimeException {

    private String companyName;

    public CompanyNotFoundException(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String toString() {
        return "CompanyNotFoundException{" + "companyName='" + companyName + '\'' + '}';
    }
}
