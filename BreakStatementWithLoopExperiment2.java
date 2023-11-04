public class BreakStatementWithLoopExperiment2 {
  public static void main(String[] args) {
    // Initialize the variable `sum` with 0
    int sum = 0;
    // Create a for loop that iterates from 1 to 7
    for (int j = 1; j <= 7; j++) {
      // Add the value of `j` to the `sum` variable
      sum += j;
      // Check if the value of `sum` is greater than 10
      if (sum > 10) {
        // If true, break the loop and exit out of it
        break;
      }
      // Print the value of `sum` within the loop
      System.out.println("Experiment 2: sum = " + sum);
    }
  }
}