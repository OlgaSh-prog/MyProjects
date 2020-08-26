package Lesson11_08_2020;

public class MainMonster {

    public void callMonster (Monster [] monsters) {
        for (Monster monster : monsters) {
            monster.destroy();
        }
    }
}
