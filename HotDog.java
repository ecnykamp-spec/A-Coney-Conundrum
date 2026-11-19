public class HotDog {
   // returns the number of combinations
   public long printMenu( ) {
    String[] toppingsList = {""," Ketchup"," Mustard"," Chopped Onions"," Tomato Wedge"," Sweet Relish", " Sport Peppers"," Sauerkraut"};
    int[] priceList = {0,15, 17, 20, 25, 30,35, 45};
    int price = 99;
    int i = 0;
    int counter = 0;

    while(i <= toppingsList.length-1){
        //toppings = toppings + toppingsList[i];
        price = price + priceList[i];
        System.out.println(counter + " Dog in Bun with" + toppingsList[i]);
        i++;
        counter++;
    }
return counter;    
}
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
