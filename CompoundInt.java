class Compound {
  // This method calculates the compound interest
  public double calculateCompoundInterest(double principal, double rate, double years) {
    // The Math.pow() function is used to raise a number to the power of another number
    //  it calculates the compound interest using the formula
    return principal * Math.pow((1 + rate / 12), years*12);
  }
}
public class CompoundInt {
  public static void main(String[] args) {
    // Define the principal, rate, and number of years
    double P = 500000;
    double R = 0.18;
    double Y = 3;
    
    // Create an object of the Compound class
    Compound compob = new Compound();
    
    // Call the calculateCompoundInterest() method with the provided principal, rate, and years
    double interest = compob.calculateCompoundInterest(P, R, Y);
    
    // Print the calculated compound interest
    System.out.println("Compound interest is: " + interest);
  }
}