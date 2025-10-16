public class Book extends ItemForSale {
    public Book(String name, int price, Date dateOfOnSale, Author author, String publisher) {
        super(name, price, dateOfOnSale);
        this.author = author;
        this.publisher = publisher;
    }

    private String publisher;

    // precondition: 
    //postcondition: returns the publisher's name
    public String getPublisher() {
        return publisher;
    }
    // precondition: 
    //postcondition: sets publisher name as the input
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
