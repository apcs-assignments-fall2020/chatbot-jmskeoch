import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This takes in the user's name and prints it back with a sarcastic line because I really don't care
        System.out.println("What is your name? ");
        String username = scanner.next();
        System.out.println("Wow, what a cool name, " + username);

        //This takes in the user's favorite color and prints it back
        System.out.println("What about your favorite color? ");
        String favoriteColor = scanner.next();
        System.out.println("Wow, how cool! My favorite color is " + favoriteColor + " too! ahahah");

        //This takes in the user's favorite number and prints it back
        System.out.println("What is your favorite number? ");
        int favoriteNumber = scanner.nextInt(); 
        System.out.println(favoriteNumber + " is a cool number! My favorite number 47! ");

        //This takes in the user's favorite food
        System.out.println("We all like food. It's impossible to not like food. What is your favorite food? ");
        String favoriteFood = scanner.next();
        System.out.println("ew " + favoriteFood + " is nasty why do you like that? Mandarin Orange Chicken is way better");

        //This takes in the user's favorite drink
        System.out.println("Okay last interrogation question, what is your favorite drink?");
        String favoriteDrink = scanner.next();
        System.out.println("Ehhhhh, okay. I guess we can agree that " + favoriteDrink + " is decent. Nothing tops water, though");

        scanner.close();
    }
}
