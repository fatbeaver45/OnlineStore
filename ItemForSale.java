public class ItemForSale {
    public ItemForSale(String name, int price, Date dateOfOnSale) {
        this.name = name;
        this.price = price;
        this.dateOfOnSale = dateOfOnSale;
    }

    protected String name;
    protected int price;
    protected Author author;
    protected Date dateOfOnSale;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public Date getDateOfOnSale() {
        return dateOfOnSale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setDateOfOnSale(Date dateOfOnSale) {
        this.dateOfOnSale = dateOfOnSale;
    }
}
