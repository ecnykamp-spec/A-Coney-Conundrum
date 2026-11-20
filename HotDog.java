
public class HotDog {
   // returns the number of combinations
   public long printMenu( ) {
    String[] toppingsList = {" Ketchup"," Mustard"," Chopped Onions"," Tomato Wedge"," Sweet Relish", " Sport Peppers"," Sauerkraut"};
    int[] priceList = {15, 17, 20, 25, 30,35, 45};
    String toppings = "";
    int price = 99;
    int counter = 1;
    for (int i = 0; i <= toppingsList.length-1; i++){
        for (int j = i; j <= toppingsList.length-1; j++) {
            toppings = toppings + toppingsList[j];
            price = price + priceList[j];
            System.out.println(/*counter + */" Dog in Bun with" + toppings +" $" + 0.01*price);
            counter++;  
        }
        toppings = "";
        price = 99;
    }

    for (int k = 0; k <= toppingsList.length-1; k++) {
        for (int i = 0; i <= toppingsList.length-1; i++){
            for (int j = i; j <= toppingsList.length-(k+1); j++) {
            toppings = toppings + toppingsList[j] + toppingsList[j + k];
            price = price + priceList[j + k];
            System.out.println(/*counter + */" Dog in Bun with" + toppings +" $" + 0.01*price);
            counter++;

        }
        toppings = "";
        price = 99;
    }
    }
return counter++;
}
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
/* 
public class HotDog {
   // returns the number of combinations
   public long printMenu( ) {
    String[] toppingsList = {" Ketchup"," Mustard"," Chopped Onions"," Tomato Wedge"," Sweet Relish", " Sport Peppers"," Sauerkraut"};
    int[] priceList = {15, 17, 20, 25, 30,35, 45};
    String toppings = "";
    int price = 99;
    int counter = 1;
    for (int i = 0; i <= toppingsList.length-1; i++){
        for (int j = i; j <= toppingsList.length-1; j++) {
            toppings = toppings + toppingsList[j];
            price = price + priceList[j];
            System.out.println(counter +  " Dog in Bun with" + toppings +" $" + 0.01*price);
            counter++;  
        }
        toppings = "";
        price = 99;
    }
    for (int k = 0; k <= toppingsList.length-1; k++) {
        for (int i = 0; i <= toppingsList.length-1; i++){
            for (int j = i; j <= toppingsList.length-(k+1); j++) {
                toppings = toppings + toppingsList[j + k];
                price = price + priceList[j + k];
                System.out.println(counter + " Dog in Bun with" + toppings +" $" + 0.01*price);
                counter++;  
        }
        toppings = "";
        price = 99;
    }
    }

return counter++;
}
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
*/