public class Rent {

    String customer, Movie, Staffmemb;

    public Rent(String customer, String movie, String staffmemb) {
        this.customer = customer;
        Movie = movie;
        Staffmemb = staffmemb;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getMovie() {
        return Movie;
    }

    public void setMovie(String movie) {
        Movie = movie;
    }

    public String getStaffmemb() {
        return Staffmemb;
    }

    public void setStaffmemb(String staffmemb) {
        Staffmemb = staffmemb;
    }
}
