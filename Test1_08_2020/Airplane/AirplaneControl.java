package Test1_08_2020.Airplane;

public class AirplaneControl {

    int up = (int) (Math.random() * (300 - 250) + 250);        //движение Вверх
    int down = (int) (Math.random() * (300 - 250) + 250);       //движение Вниз
    int forward = (int) (Math.random() * (300 - 100) + 100);    //движение Вперёд
    int backward = (int) (Math.random() * (200 - 100) + 100);  //движение Назад


    public void upwardMovement() {
        System.out.println("Moving up: " + up + "км/ч");
    }

    public void downMovement() {
        System.out.println("Moving down: " + down + "км/ч");
    }

    public void forwardMovement() {
        System.out.println("Moving forward: " + forward + "км/ч");
    }

    public void backMovement() {
        System.out.println("Moving back: "+ backward +"км/ч");
    }

}
