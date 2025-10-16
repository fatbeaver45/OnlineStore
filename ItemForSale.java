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
    //precondition: 
    //postcondition: returns name of Item     
    public String getName() {
        return name;
    }
    //precondition: 
    //postcondition: returns price of item
    public int getPrice() {
        return price;
    }
    //precondition: 
    //postcondition: returns Author of Item (as an Author object)
    public Author getAuthor() {
        return author;
    }
    //precondition: 
    //postcondition: returns Date of when the item was placed on sale (as a Date object)
    public Date getDateOfOnSale() {
        return dateOfOnSale;
    }
    //precondition: 
    //postcondition: sets name as input
    public void setName(String name) {
        this.name = name;
    }
    //precondition: 
    //postcondition: sets price as input
    public void setPrice(int price) {
        this.price = price;
    }
    //precondition: 
    //postcondition: sets Author as input
    public void setAuthor(Author author) {
        this.author = author;
    }
    //precondition: 
    //postcondition: sets Date of when placed on sale as input
    public void setDateOfOnSale(Date dateOfOnSale) {
        this.dateOfOnSale = dateOfOnSale;
    }
}
