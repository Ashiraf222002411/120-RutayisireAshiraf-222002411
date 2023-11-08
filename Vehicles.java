// The Vehicles class is the base class representing different types of vehicles.
class Vehicles {

    // Method to display general information about vehicles.
    public void displayInfo(){
        System.out.println("THERE ARE VARIOUS TYPES OF VEHICLES WITH DIFFERENT FUNCTIONS AND FEATURES.");
    }
}

// Interface for sports cars.
interface SportsCar {
    void displaySpeed(); // Method to display the speed of the sports car.
}

// The Sedan class is a type of vehicle that extends the Vehicles class.
class Sedan extends Vehicles {

    // Method to describe the features of a sedan.
    public void describe() {
        System.out.println("A SEDAN IS A TYPE OF PASSENGER CAR THAT USUALLY HAS FOUR DOORS AND A SEPARATE TRUNK.");
    }
}

// The ElectricCar class represents a specific type of car that is an extension of the Sedan class and implements the SportsCar interface.
class ElectricCar extends Sedan implements SportsCar {

    // Method to display the speed of the electric car.
    public void displaySpeed() {
        // Electric car's implementation of the displaySpeed method
    }
}

// The CarFleet class represents a fleet of cars, including sedans and electric cars, which extends the ElectricCar class.
class CarFleet extends ElectricCar {

    // Method to describe the car fleet.
    public void fleetDescription() {
        System.out.println("A FLEET OF CARS CAN CONSIST OF VARIOUS TYPES OF VEHICLES, INCLUDING SEDANS AND ELECTRIC CARS.");
    }
}

// The Main class contains the main method for running the program.
class Main {

    // The main method where the program execution starts.
    public static void main(String[] args) {
        CarFleet carFleet = new CarFleet(); // Creating an instance of the CarFleet class.

        System.out.println(); // Jump line
        carFleet.displayInfo(); // Calling the displayInfo method to display general vehicle information.
        carFleet.describe(); // Calling the describe method to describe the features of a sedan.
        carFleet.fleetDescription(); // Calling the fleetDescription method to describe the car fleet.
        System.out.println(); // Jump line
    }
}
