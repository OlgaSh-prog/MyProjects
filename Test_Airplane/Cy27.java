package Test_Airplane;

public class Cy27 extends Airplane implements Capability {

    int turbo = (int) (Math.random() * (1000 - 300) + 300);
    int days = (int) (Math.random() * (50 - 1) + 1);
    int number = (int) (Math.random() * (10 - 1) + 1);

    @Override
    public void turboBoost() {

        if (turbo > 300){
            System.out.println(turbo + " - turbo Boost! \n");

        }else {
            System.out.println("Boost did not occur! Try Again! \n");
        }
    }

    @Override
    public void StealthTechnology() {
        System.out.println("Warning! The airplane has not been seen for " + days + " days! \n");
    }

    @Override
    public void nuclearStrike() {
        System.out.println("Warning! " + number + " nuclear warheads were dropped!!! \n");
    }
}
