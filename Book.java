public class Book extends ItemForSale {
    public Book(String name, int price, Date dateOfOnSale, Author author, String publisher) {
        super(name, price, dateOfOnSale);
        this.author = author;
        this.publisher = publisher;
    }

    private String publisher;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
