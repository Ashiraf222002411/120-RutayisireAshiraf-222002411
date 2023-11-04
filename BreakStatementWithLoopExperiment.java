// Define the class named BreakStatementWithLoopExperiment
public class BreakStatementWithLoopExperiment {
  
  // Main method
  public static void main(String[] args) {
    
    // Start a for loop that initializes an integer variable i with a value of 1,
    // continues as long as i is less than or equal to 10,
    
    for (int i = 1; i <= 10; i++) {
      
      // Check if the value of i is equal to 6
      if (i == 6) {
        // If i is equal to 6, execute the break statement,
        // which will terminate the loop and move to the next statement after the loop
        break;
      }
      
      // Print the value of i
      System.out.println("Value of i: " + i);
    }
  }
}