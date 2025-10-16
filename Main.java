public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 
     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book("Life of Pi", 10, new Date(3, 20, 2000), new Author("Martel", new Date(1,1,1950)), "Penguin");
        s.addItem(b);
        ItemForSale c = new ItemForSale("soccer ball", 5, new Date(1,1,2001));
        System.out.println(s.hasCreator(c));
        s.addItem(c);
      
        for(ItemForSale i: s.showItems()){
            if(s.hasCreator(i)){
               System.out.println(i.getAuthor().getName());
            }
            else{
               System.out.println("no author");
            }
        }
          s.sellItem(c);

        System.out.println(b instanceof ItemForSale);
     }
}
