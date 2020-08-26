package Lesson11_08_2020;

public class Main {

    public static void main(String[] args) {

        Godzilla godzilla = new Godzilla();
        Dracula dracula = new Dracula();
        MainMonster mainMonster = new MainMonster();

        Monster [] monsters = {godzilla, dracula};

        mainMonster.callMonster(monsters);
    }
}
