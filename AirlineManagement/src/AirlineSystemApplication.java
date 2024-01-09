import util.AirlineBookingSystem;

public class AirlineSystemApplication {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to the airline booking system!");
        AirlineBookingSystem mySystem = new AirlineBookingSystem();
        mySystem.runningAirlineSystem();
        System.out.println("Thanks for using our service");
    }
}