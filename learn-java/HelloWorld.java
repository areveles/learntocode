import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // System output
    System.out.println("Hello, World!");
    System.out.println("Please enter your name: ");
    String name = scanner.nextLine();

    // System string input  
    System.out.println("Hello, " + name + ". Pleasure to meet you!");
    
    int age = 0;
    boolean valid = false;
    while (!valid) {
        try {
            System.out.println("How old are you, " + name + "?");
            age = scanner.nextInt();
            valid = true; // Exit the loop if input is valid
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer for your age.");
            scanner.next(); // Consume the invalid input
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            // Handle other unexpected exceptions here
        }
    }
    System.out.printf("Wonderful! Your name is %s and you are %d years old.\n", name, age);

    scanner.close();
  }
}
