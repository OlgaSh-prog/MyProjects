package Lesson11_08_14_2020;

public class Godzilla extends TerribleMonster implements Monster{

    @Override
    public void destroy() {

        System.out.println("Godzilla - terrible monster, destroying everything! ");
    }

    @Override
    public void kill() {
        System.out.println("Godzilla - terrible monster, killing everyone! ");
    }

    @Override
    public void scareChildren() {
        System.out.println("Godzilla - terrible monster, scares children! ");
    }

    @Override
    public void eatAlive() {
        System.out.println("Godzilla - terrible monster, eating alive! ");
    }
}
