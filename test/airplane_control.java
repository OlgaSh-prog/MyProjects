package test;

public class airplane_control {
    public static void main(String[] args) {

        int up = (int) (Math.random() * (700 + 1) + 100);        //движение Вверх
        int down = (int) (Math.random() * (700 + 1) + 100);       //движение Вниз
        int forward = (int) (Math.random() * (700 + 1) + 100);    //движение Вперёд
        int backward = (int) (Math.random() * (700 + 1) + 100);  //движение Назад

        System.out.println("движение Вверх: " + up + "км/ч");
        System.out.println("движение Вниз: " + down + "км/ч");
        System.out.println("движение Вперёд: " + forward + "км/ч");
        System.out.println("движение Назад: " + backward + "км/ч");

        System.out.println("");



        int engine_starting = (int) ( Math.random() * (88+1) + 20 );        //запуск двигателей
        int takeoff = (int) ( Math.random() * 1000);                        //взлёт самолёта

        System.out.println("запуск двигателей: " + engine_starting + "км/ч");
        System.out.println("взлёт самолёта: " + takeoff + "км/ч");
        System.out.println("посадка самолёта: " + "Самолёт идёт на посадку");
    }
}

//    abstract class airplane{
//
//        int engine_starting = (int) ( Math.random() * (10+1) + 88 );        //запуск двигателей
//        int takeoff = (int) ( Math.random() * 1000);                        //взлёт самолёта
//        int plane_landing = 0;                                              //посадка самолёта
//    }
//
//    public void display() {
//
//    }
//
//}


//    public static void main(String[] args) {
//
//        Employee sam = new Employee("Sam", "Leman Brothers");
//        sam.display();
//        Client bob = new Client("Bob", "Leman Brothers");
//        bob.display();
//    }
//}
//abstract class Person {
//
//    private String name;
//
//    public String getName() { return name; }
//
//    public Person(String name){
//
//        this.name=name;
//    }
//
//    public abstract void display();
//}
//
//class Employee extends Person{
//
//    private String bank;
//
//    public Employee(String name, String company) {
//
//        super(name);
//        this.bank = company;
//    }
//
//    public void display(){
//
//        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
//    }
//}
//
//class Client extends Person
//{
//    private String bank;
//
//    public Client(String name, String company) {
//
//        super(name);
//        this.bank = company;
//    }
//
//    public void display(){
//
//        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
//    }
//}

