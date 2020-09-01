package Lesson12_08_26_2020;

public enum Months {

    JANUARY(31, Seasons.WINTER), FEBRUARY(29, Seasons.WINTER), MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING), MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER), SEPTEMBER(30, Seasons.FALL),
    OCTOBER(31, Seasons.FALL), NOVEMBER(30, Seasons.FALL), DECEMBER(31, Seasons.WINTER);

    private int days;
    private  Seasons season;

    Months(int days, Seasons season){
        this.days = days;
        this.season = season;
    }


    public int getDays() {
        return days;
    }

    public Seasons getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "Months {" + name() +
                ", days = " + days +
                ", season = " + season +
                '}';
    }
}
