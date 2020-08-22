package Test_Airplane;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class Main {

    public static void main(String[] args) {

        int length = 33;
        int width = 28;
        int weight = 4000;
        int max = 0;
        String color = "White";

        System.out.println("Preparing the plane for departure. \n");
        
        Cy27 cy27 = new Cy27();
        AirplaneControl airplaneControl = new AirplaneControl();

        System.out.println("The plane starts moving: ");
        airplaneControl.backMovement();
        airplaneControl.forwardMovement();

        System.out.println("\n" + "Starting the engine. ");
        cy27.engineStart();

        System.out.println("The plane accelerates and takes off.");
        airplaneControl.upwardMovement();
        cy27.planeTakeoff();


        System.out.println("Turn on STEALTH technology.");
        cy27.StealthTechnology();

        System.out.println("Dropping nuclear warheads.");
        cy27.nuclearStrike();

        System.out.println("Turbo Boost turns on.");
        cy27.turboBoost();

        cy27.planeLanding();
        airplaneControl.downMovement();

        System.out.println("\n" + "Congratulations! Mission completed!");
    }
}