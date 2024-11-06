import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      //start of prompt
      System.out.print("What type of item should fill the jar?");
      String userItemInput = scanner.nextLine();
      
      System.out.printf("What is the maximum amount of %s?: ", userItemInput);
      int userMaxNumInput = Integer.parseInt(scanner.nextLine());
      
      System.out.printf("The max number of %s is %d%n", userItemInput, userMaxNumInput);
      System.out.printf("Item filling in the jar is: %s%n", userItemInput);
     //end of prompt
      
      //instance of jar
      Jar jar = new Jar(userItemInput, userMaxNumInput);
      
      //access to random number
      jar.fill();
      
      
      System.out.printf("How many %s are in the jar? Pick a number between 1 and %d.%n",
                        userItemInput, userMaxNumInput);
      //end of first prompt//
      
      
      
      //second prompt 
      System.out.print("Enter a number:  ");
      int userGuess = Integer.parseInt(scanner.nextLine());
      int targetNumber = jar.getRandomNumber();
      int numberOfGuesses = 0;
      
      while(userGuess != targetNumber){
        if( userGuess > targetNumber){
          System.out.print("You guess was high. Try again: ");
          numberOfGuesses++;
        } else {
          System.out.print("Your guess was low. Try again: ");
          numberOfGuesses++;
        }
          userGuess = Integer.parseInt(scanner.nextLine());
        }
          System.out.printf("You got it! Nice job!%n");
       
         int attempts = numberOfGuesses + 1;
         System.out.printf("You got it in %d attempt(s)", attempts);  
    }
}
