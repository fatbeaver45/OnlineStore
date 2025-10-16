public class Movie extends ItemForSale{

    public Movie(String name, int price, Date dateOfOnSale, Author author, int duration) {
        super(name, price, dateOfOnSale);
        this.author = author;
        this.duration = duration;
    }

    private int duration;
    //precondition: 
    //postcondition: returns duration
    public int getDuration() {
        return duration;
    }
    //precondition: 
    //postcondition: sets duration as input
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
