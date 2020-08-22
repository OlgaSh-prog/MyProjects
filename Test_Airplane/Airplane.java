package Test_Airplane;

public abstract class Airplane {

    int time = (int) (Math.random() * (88 - 20) + 20);
    int distance = (int) (Math.random() * (1000) + 1);

    public  void engineStart(){
        System.out.println(time + " minutes left before the plane will took off! \n");
    }

    //Взлет
    public void planeTakeoff(){
        System.out.println("The plane flew " + distance + " km on a full tank of fuel! \n");
    }

    //Посадка
    public void planeLanding(){
        System.out.println("The plane is landing.");
    }
}
