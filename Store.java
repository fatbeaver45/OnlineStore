/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

import java.util.ArrayList;

public class Store
{

  private int profit;
  private ArrayList<ItemForSale> items = new ArrayList<ItemForSale>();

  Author authorless = new Author(null, null);

  public ArrayList<ItemForSale> showItems(){
    return items;
  }
  public void addItem(ItemForSale item){
    items.add(item);
  }
  public void sellItem(ItemForSale item){
    profit+=item.getPrice();
    items.remove(item);
  }
  public Author creator(ItemForSale item){
    return item.getAuthor();
  }
  public boolean hasCreator(ItemForSale item){ // this should be always checked before using the method 'creator'
    if(item instanceof Book || item instanceof Movie){
      return true;
    }
    else{
      return false;
    }
  }
}
