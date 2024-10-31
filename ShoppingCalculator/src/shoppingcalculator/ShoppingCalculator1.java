package shoppingcalculator;

import java.util.Locale;
import java.util.Scanner;

public class ShoppingCalculator1 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        kbd.useLocale(Locale.ENGLISH);

        // Arrays representing item names and their corresponding prices
        String[] itemNames = { "Bread", "Milk", "Eggs", "Apples", "Cheese" };
        double[] itemPrices = { 19.50, 13.75, 15.00, 4.20, 50.00 };

        // Total price for the shopping cart
        double total = 0.0;
        String continueShopping;

        System.out.println("Welcome to the Shopping Calculator!");
        System.out.println("Available items: Bread, Milk, Eggs, Apples, Cheese");
        System.out.println("Enter 'done' when you are finished shopping.");
        
        do {
            // Prompt for item name
            System.out.print("Enter the name of the item you want to buy: ");
            String itemName = kbd.nextLine();
            
            // Allow user to finish shopping by typing "done"
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            
            // Find the price of the entered item
            double price = findPrice(itemName, itemNames, itemPrices);
            
            if (price == -1) {
                System.out.println("Item not found in the database. Please check spelling.");
            } else {
                System.out.println("Item: " + itemName + " - R" + price);
                total += price; // Add price to total
            }
            
            // Prompt to see if the user wants to continue
            System.out.print("Would you like to add another item? (yes/no): ");
            continueShopping = kbd.nextLine();
        } while (continueShopping.equalsIgnoreCase("yes"));
        
        // Display the total amount
        System.out.println("--------------------------------------------------");
        System.out.println("Total: R" + total);
    }

    // Helper method to find the price of an item by name using parallel arrays
    public static double findPrice(String itemName, String[] itemNames, double[] itemPrices) {
        for (int i = 0; i < itemNames.length; i++) {
            // Check if the item name matches (case-insensitive)
            if (itemNames[i].equalsIgnoreCase(itemName)) {
                return itemPrices[i]; // Return the corresponding price if found
            }
        }
        return -1; // Return -1 if the item is not found
    }
}
