package shoppingcalculator;

import java.util.Locale;//used to set the rules for language-specific format
import java.util.Scanner;//used to read the users input

public class ShoppingCalculator {
    
    
    public static void main(String[] args) {//        main method
        Scanner kbd = new Scanner (System.in);//        Reads what is typed out
        String name1 = null;//        the name withouta value
        kbd.useLocale(Locale.ENGLISH);//        Tells the scanner to set english for the value
        
        double se,sl,sg,sd,sb;//        set of values
        double tot;//        total

       
       System.out.print("Enter the name of the first item you want to buy :");//       asks for the name of the first item
       String item1 = kbd.nextLine(); //       Reads the line of text the users uses for the first item
       item1 = kbd.nextLine();
       
       System.out.print("Enter the price of the first item: R");//       asks for the price of the first item
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
       //       prints out the items selected
       System.out.println("You have selected the following items :");
       System.out.println("--------------------------------------------------");

//       Prints out the Items and their values
       System.out.println("Item: " + item1 +" " + se+ " ");
       System.out.println("Item: " + item2 +" " + sl+ " ");
       System.out.println("Item: " + item3 +" " + sg+ " ");
      

       System.out.println("--------------------------------------------------");
       
//       calculates te total
       tot = se + sl + sg;
       System.out.println("You have selected to buy the following items: :");
       System.out.println("total : R" + tot);
       
    }
    
}
 
