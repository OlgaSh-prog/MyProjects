package Lesson10_07_27_2020.Lesson1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Default output:");

        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();

        System.out.println("\n" + "Using an array: ");

        Robot[] robotMass =  {robot,coffeeRobot,robotDancer,robotCooker};

        for (int i = 0; i <robotMass.length ; i++) {
            robotMass[i].work();
        }



    }
}
