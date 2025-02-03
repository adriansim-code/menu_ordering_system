import java.util.Objects;
import java.util.Scanner;

public class menu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name; // User's name
        int burritoSize; // burrito's size
        char tortillaType; // Tortilla type
        String tortilla = "Flour"; // default tortilla type
        double price = 10.98; // Cost of burrito by default
        final double taxRate = .08; // Sales tax rate
        double tax; // Amount of tax
        char choice;
        String userInput; // User input
        String ingredients = "Rice, beans, cheese "; // List of ingredients
        int amountOfProtein = 0;
        int amountOfVeggies = 0;
        boolean discount = false; // Flag for discount
// Prompt user and get first name.
        System.out.println("Welcome to The Refined Burrito Restaurant");
        System.out.print("Please Enter your first name to see the menu: ");
        name = input.nextLine();

// If customer has same name as owners they get discount
        if (Objects.equals(name, "Jose") || Objects.equals(name, "Maria")){
            discount = true;
        }
// Prompt user to get burrito's size
        System.out.println("Burritos (size in inches) Cost");
        System.out.println(" Mini 4 $6.98");
        System.out.println(" Medium 6 $7.98");
        System.out.println(" Large 8 $9.98");
        System.out.println(" Megalodon 10 $10.98");
        System.out.print("Please enter one digit that corresponds to the Burrito size you want to order: ");
        burritoSize = input.nextInt();
        /*
        Set price and size of burrito using if-else-if statements.
        */
        if (burritoSize == 4){

            price = 6.98;

        } else if (burritoSize == 6) {

            price = 7.98;


        } else if (burritoSize == 8) {

            price = 9.98;

        } else if (burritoSize == 10) {
            price = 10.98;
        } else {
            System.out.println("That was not an option, default burrito is 10 inchs");
            price = 10.98;
            burritoSize = 10; 
        }
        input.nextLine();

// Prompt user to get their tortilla type.
        System.out.println("What type of tortilla do you want? ");
        System.out.print("(C)Corn, (F) Flour, or (S) Spanish. (Please Enter C, F, or S): ");

    userInput = input.nextLine();
    tortillaType = userInput.charAt(0);
/*
Use the switch statement to select the type of tortilla used on your
burrito.
*/
        switch (userInput){
            case "f", "F":
                tortilla = "Flour";
                break;
            case "C", "c":
                tortilla = "Cron";
                break;
            case "S", "s":
                tortilla = "Spanish";
                break;
            default:
                System.out.println("That was not an option, Flour tortilla will be used.");
        }
        System.out.println("All Burritos come with rice, beans and cheese.");
        System.out.println("Choose your protein for $2.15 each, choose from:");
        System.out.println("Chicken, Beef, Carnitas, or Shrimp");
        // add to protein list and number of items
        System.out.print("Do you want Chicken? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y'){
            amountOfProtein +=1;
            ingredients = ingredients + ",Chicken ";
        }
        System.out.print("Do you want Beef? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y'){
            amountOfProtein +=1;
            ingredients = ingredients + ",Beef ";
        }
        System.out.print("Do you want Carnitas? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y'){
            amountOfProtein +=1;
            ingredients = ingredients + ",Carnitas ";
        }
        System.out.print("Do you want Shrimp? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y'){
            amountOfProtein +=1;
            ingredients = ingredients + ",Shrimp ";
        }
        System.out.println("Choose your veggies for $1.25 each, choose from:");
        System.out.println("Pico de Gallo, Lettuce, Corn, or Pepper and Onions");
        System.out.print("Do you want Pico de Gallo? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y'){
            amountOfVeggies +=1;
            ingredients = ingredients + ",Pico de Gallo ";
        }
        System.out.print("Lettuce? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y'){
            amountOfVeggies +=1;
            ingredients = ingredients + ",Lettuce ";
        }
        System.out.print("Corn? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y'){
            amountOfVeggies +=1;
            ingredients = ingredients + ",Corn ";
        }
        System.out.print("Pepper and Onions? (Y/N): ");
        userInput = input.nextLine();
        choice = userInput.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            amountOfVeggies +=1;
            ingredients = ingredients + ",Pepper and Onions ";
        }
    }
}