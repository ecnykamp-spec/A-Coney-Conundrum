
public class HotDog {
   // returns the number of combinations
   public long printMenu( ) {
    String[] toppingsList = {" Ketchup"," Mustard"," Chopped Onions"," Tomato Wedge"," Sweet Relish", " Sport Peppers"," Sauerkraut"};
    int[] priceList = {15, 17, 20, 25, 30,35, 45};
    String toppings = "";
    int price = 99;
    int counter = 1;
   System.out.println("0 Dog in Bun");
    for (int i = 0; i <= toppingsList.length-1; i++) {
         //toppings = toppings + toppingsList[i];
        price = price + priceList[i];
        System.out.println(counter + " Dog in Bun with" + toppingsList[i] +" $" + 0.01*price);
        counter++;  
    }
        for (int i = 0; i <= toppingsList.length-1; i++) {
         toppings = toppings + toppingsList[i];
        price = price + priceList[i];
        System.out.println(counter + " Dog in Bun with" + toppings +" $" + 0.01*price);
        counter++;  
    }
      System.out.println("-----------------------------------");
        for (int i = 1; i <= toppingsList.length-1; i++) {
        toppings = toppings + toppingsList[Math.abs(i-toppingsList.length)];
        price = price + priceList[Math.abs(i-toppingsList.length)];
        System.out.println(counter + " Dog in Bun with" + toppings +" $" + 0.01*price);
        counter++;  
    }
return counter++;
}
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
