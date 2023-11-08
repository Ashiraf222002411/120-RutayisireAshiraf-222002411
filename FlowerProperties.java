// Interface representing properties of flowers.
public interface FlowerProperties {
    void display();
}

// Class representing a flower 'Rose' that inherits properties from class 'Tulip' and implements FlowerProperties interface.
class Rose extends Tulip implements FlowerProperties {

    // Method specific to the Rose class.
    public void startMessage() {
        System.out.println("Roses are widely known for their beauty and fragrance!");
        System.out.println();
        System.out.println("Tulips come after roses, don't they?");
    }
}

// Parent class representing 'Tulip'.
class Tulip {

    // Method in the Tulip class.
    public void display() {
        // Implementation for display method in Tulip class
    }
}

// Class representing a flower 'Sunflower' that inherits properties from class 'Daisy'.
class Sunflower extends Daisy {

    // Method specific to Sunflower class.
    public void byeMessage() {
        System.out.println("So, Sunflowers and Daisies.");
    }
}

// Class representing 'Daisy'.
class Daisy {

    // Method in the Daisy class.
    public void goodbyeMessage() {
        System.out.println("Then, Daisies it is.");
    }
}

// Class FlowerApp that contains the main method.
class FlowerApp {

    // Main method for execution.
    public static void main(String[] args) {

        Rose first = new Rose();
        Sunflower middle = new Sunflower();
        Daisy last = new Daisy();

        first.startMessage(); // Calling the startMessage method of the Rose class.
        middle.byeMessage(); // Calling the byeMessage method of the Sunflower class.
        last.goodbyeMessage(); // Calling the goodbyeMessage method of the Daisy class.

        System.out.println(); // Adding a line break.
        System.out.println("THANKS!"); // Output a message.

    }
}
