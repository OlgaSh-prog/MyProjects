package Lesson10_07_27_2020.Lesson3;

public class Mammal extends Animal{

    public Mammal(int age, double weight) {
        super(age, weight);
    }

    public final void Move(){
        System.out.println("Mammal - Run");
    }
}
