package Test_Airplane;

public class airplane_control {
    public static void main(String[] args) {

        int up = (int) (Math.random() * (300 - 250) + 250);        //движение Вверх
        int down = (int) (Math.random() * (300 - 250) + 250);       //движение Вниз
        int forward = (int) (Math.random() * (300 - 100) + 100);    //движение Вперёд
        int backward = (int) (Math.random() * (200 - 100) + 100);  //движение Назад

        System.out.println("движение Вверх: " + up + "км/ч");
        System.out.println("движение Вниз: " + down + "км/ч");
        System.out.println("движение Вперёд: " + forward + "км/ч");
        System.out.println("движение Назад: " + backward + "км/ч");

        System.out.println("");


        int engine_starting = (int) (Math.random() * (88 + 1) + 20);        //запуск двигателей
        int takeoff = (int) (Math.random() * 1000);                        //взлёт самолёта

        System.out.println("запуск двигателей: " + engine_starting + "км/ч");
        System.out.println("взлёт самолёта: " + takeoff + "км/ч");
        System.out.println("посадка самолёта: " + "Самолёт идёт на посадку");
    }
}