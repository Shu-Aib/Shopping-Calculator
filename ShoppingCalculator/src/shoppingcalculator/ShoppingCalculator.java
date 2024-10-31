package shoppingcalculator;

import java.util.Locale;
import java.util.Scanner;

public class ShoppingCalculator {
    
    
    public static void main(String[] args) {
        Scanner kbd = new Scanner (System.in);
        String name1 = null;
        kbd.useLocale(Locale.ENGLISH);
        
        double se,sl,sg,sd,sb;
        double tot;

       
       System.out.print("Enter the name of the first item you want to buy :");
       String item1 = kbd.nextLine();
       item1 = kbd.nextLine();
       
       System.out.print("Enter the price of the first item: R");
       se = kbd.nextDouble();
       
       System.out.print("Enter the name of the second item you want to buy :" );
       String item2 = kbd.nextLine();
       item2 = kbd.nextLine();
       
       System.out.print("Enter the price of the second item: R");
       sl = kbd.nextDouble();
       
       System.out.print("Enter the name of the third item you want to buy : ");
       String item3 = kbd.nextLine();
       item3 = kbd.nextLine();
       
       System.out.print("Enter the price of the third item: R");
       sg = kbd.nextDouble();
       
       
       System.out.println("==================================================");
       System.out.println("You have selected the following items :");
       System.out.println("--------------------------------------------------");

       System.out.println("Item: " + item1 +" " + se+ " ");
       System.out.println("Item: " + item2 +" " + sl+ " ");
       System.out.println("Item: " + item3 +" " + sg+ " ");
      

       System.out.println("--------------------------------------------------");
       
       tot = se + sl + sg;
       System.out.println("You have selected to buy the following items: :");
       System.out.println("total : R" + tot);
       
    }
    
}
