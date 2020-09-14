import java.util.Scanner;

/**
 * This program asks for two numbers and then calculates the quotient of that number and the remainder
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for two integers on seperate lines to divide
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    // declare and initialize a variable for integer1
    int integer1 = input.nextInt();

    // declare and initialize a variable for integer 2
    int integer2 = input.nextInt();

    // declare amd calculate the quotient of that number 
    int quotient = integer1 / integer2;

    //declare amd calculate the remander of that numbers
    int remainder = integer1 % integer2;

    // tell the user the quotient of that number and the remainder
    System.out.println(integer1 + "/" + integer2 + " is "+ quotient + " with a remainder of " + remainder + ".");


  }
}
