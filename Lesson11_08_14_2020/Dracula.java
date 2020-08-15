package Lesson11_08_14_2020;

public class Dracula extends TerribleMonster implements Monster {

    @Override
    public void destroy() {
        System.out.println("Dracula - terrible monster, destroying everything! ");
    }

    @Override
    public void kill() {

        System.out.println("Dracula - terrible monster, killing everyone! ");
    }

    @Override
    public void scareChildren() {
        System.out.println("Dracula - terrible monster, scares children! ");
    }

    @Override
    public void eatAlive() {

        System.out.println("Dracula - terrible monster, eating alive! ");
    }
}
