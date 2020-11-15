package Lesson14_11_05_2020;

import java.util.Comparator;

public class SortByLength implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getLength() - o2.getLength();
    }
}
