public class Movie extends ItemForSale{

    public Movie(String name, int price, Date dateOfOnSale, Author author, int duration) {
        super(name, price, dateOfOnSale);
        this.author = author;
        this.duration = duration;
    }

    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
