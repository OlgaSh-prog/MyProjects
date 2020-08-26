package Lesson9_07_2020;

//Создать класс Человек в нем описать следующие поля:
//        - имя;    - тип;      - возраст;
//        добавить методы, которые в зависимости от типа человека (будет только два типа: собиратель и охотник)
//        предлагал бы некоторые виды блюд. Пользователь будет вводить то, что он хотел бы съесть из перечисленных
//        блюд (Scanner), если есть совпадение, вывести сообщение:
//        "имя человека + что съест (рандомное число) килограмм данного блюда ".


public class Human {

    private String name;
    private String type;
    private int age;
    private String menu;

    public Human() {

    }

    public Human(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMenu() {

        switch (getType()) {

            case "Picker": {

                System.out.println("1: Peach");
                System.out.println("2: Bananas");
                System.out.println("3: Apples");
                break;
            }

            case "Hunter": {
                System.out.println("1: Meat");
                System.out.println("2: Fruits");
                System.out.println("3: Fish");
                break;
            }
        }

        return menu;

    }

    public void eat(String food) {
        int random = (int) (Math.random() * 10);

        System.out.println();
        System.out.println(getName() + " have to eat: " + random + " Kg. " + food);

    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }


}