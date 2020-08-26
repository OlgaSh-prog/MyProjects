package Lesson10_07_2020.C_Animal;

public class Mammal extends Animal{

    public Mammal(int age, double weight) {
        super(age, weight);
    }

    public final void Move(){
        System.out.println("Mammal - Run");
    }
}
