import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;
    public CoffeeDrink finnsOrder;
    public CoffeeDrink bainsOrder;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2024;
        System.out.println("We are now founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Salted Caramel Latte");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        finnsOrder = new CoffeeDrink(5, "Latte", true);
        bainsOrder = new CoffeeDrink(10, "Flat White", false);


        // TODO
        // Print out the order details
        finnsOrder.printInfo();
        bainsOrder.printInfo();


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int randomInt;
        randomInt = (int)(Math.random()*31);
        System.out.println("You are gifted a random number discount of " + randomInt + "% off!");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String drinkName) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is the " + drinkName + "!");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for (int x = 1; x < 6; x++){
            System.out.println(x);
        }

        // Print 2, 5, 8, 11
        for (int x = 2; x < 12; x += 3){
            System.out.println(x);
        }

        // Print 8 to 0
        for (int x = 8; x >= 0; x--){
            System.out.println(x);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        double randomDouble;
        randomDouble = (double)(Math.random()*1);
        if (randomDouble < 0.25){
            System.out.println("The barista's choice today is the " + "Caramel Macchiato.");
        }
        else if (randomDouble > 0.25 && randomDouble < 0.5){
            System.out.println("The barista's choice today is the " + "Cold Brew.");
        }
        else if (randomDouble > 0.5 && randomDouble < 0.75){
            System.out.println("The barista's choice today is the " + "Iced Americano.");
        }
        else if (randomDouble < 1){
            System.out.println("The barista's choice today is the " + "Pumpkin Spice Latte.");
        }
    }
}

