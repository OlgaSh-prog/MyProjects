package Lesson12_08_26_2020;

public enum Months {

    DECEMBER(31, Season.WINTER), JANUARY(31, Season.WINTER), FEBRUARY(31, Season.WINTER),
    MARCH(31, Season.SPRING), APRIL(31, Season.SPRING), MAY(31, Season.SPRING),
    JUNE(31, Season.SUMMER), JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER),
    SEPTEMBER(31, Season.FALL), OCTOBER(31, Season.FALL), NOVEMBER(31, Season.FALL);

    private int days;
    private  Season season;

    Months(int days, Season season){
        this.days = days;
        this.season = season;
    }


    public int getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }
}
