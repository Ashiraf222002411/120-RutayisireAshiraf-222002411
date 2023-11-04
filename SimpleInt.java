// Define the Simple class
class Simple {
  // Method to calculate simple interest
  public double calculateSimpleInterest(double principal, double rate, double years) {
    return (principal * rate * years); 
  }
}
// Define the SimpleInt class
public class SimpleInt {
  // Main method, the entry point of the program
  public static void main(String[] args) {
    double P = 100000; 
    double R = 0.05; 
    double Y = 5; 
    Simple simpleOb = new Simple(); // Create an object of the Simple class
    double interest = simpleOb.calculateSimpleInterest(P, R, Y); // Call the calculateSimpleInterest method to calculate the interest
    System.out.println("Simple interest: " + interest); // Print the calculated simple interest
  }
}