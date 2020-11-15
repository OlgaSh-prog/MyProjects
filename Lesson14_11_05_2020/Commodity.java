package Lesson14_11_05_2020;

import java.util.*;

public class Commodity implements Comparable<Commodity>{

    private String name;
    private int length;
    private int width;
    private int weight;
    private int i = 0;

    //Constructor
    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public Commodity() {

    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    Scanner sc = new Scanner(System.in);

    //List of items
    List<Commodity> list = new ArrayList<>();

    //Methods
    public void addItem(){

        System.out.println("Item name: ");
        String name = sc.next();

        System.out.println("Length: ");
        int length = sc.nextInt();

        System.out.println("Height:");
        int height = sc.nextInt();

        System.out.println("Weight: ");
        int weight = sc.nextInt();

        System.out.println(list.add(new Commodity(name, length, height, weight)) );
    }

    public void deleteItem(){

        System.out.println("Choose which item you would like to delete by name. ");
        String name = sc.next();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getName().equalsIgnoreCase(name)){
                list.remove(i);
            }
        }
    }

    public void allItems(){

        for (Commodity commodity : list) {
            System.out.println("ID-" + i++ + ": " + commodity);
        }
    }


    public void replaceItem() {

        System.out.println("Choose which item you would like to replace by name. ");
        String name = sc.next();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("New name: ");
                list.get(i).setName(sc.next());
            }
        }
    }


    public void sortByName() {

        System.out.println("Sorting items by name. ");

        Set<Commodity> items = new TreeSet<>();
        items.addAll(list);

        for (Commodity commodity : items) {
            System.out.println(commodity);
        }
    }


    public void sortByLength(){

        System.out.println("Sorting items by Length. ");

        Set<Commodity> items = new TreeSet<>(new SortByLength());
        items.addAll(list);

        for (Commodity commodity : items) {
            System.out.println(commodity);
        }


    }

    public void sortByWidth(){

        System.out.println("Sorting items by Width. ");

        Set<Commodity> items = new TreeSet<>(new SortByWidth());
        items.addAll(list);

        for (Commodity commodity : items) {
            System.out.println(commodity);
        }

    }

    public void sortByWeight(){

        System.out.println("Sorting items by Weight. ");

        Set<Commodity> items = new TreeSet<>(new SortByWeight());
        items.addAll(list);

        for (Commodity commodity : items) {
            System.out.println(commodity);
        }

    }

    @Override
    public int compareTo(Commodity o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Commodity: {" +
                "name = '" + name + '\'' +
                ", length = " + length +
                ", width = " + width +
                ", weight = " + weight +
                '}';
    }




//    @Override
//    public int compareTo(Commodity o) {
//        if (this.length > o.getLength()){
//            return 1;
//        }else if (this.length < o.getLength()) {
//            return -1;
//        }
//        return 0;
//    }


}