package Lesson8_07_2020;

public class Rectangle {

    int width; //ширина
    int length; //длина
    int s;
    int p;

    public Rectangle(){

    }

    public Rectangle(int width1, int length1){

        width = width1;
        length = length1;

    }

    public void S(){
        s = width * length;

        System.out.println("Area S = " + s +";");
    }

    public void P(){

        p = 2 * (width +length);

        System.out.println("Perimeter P = " + p +";");
    }
}
