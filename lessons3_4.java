package MyHomeProjectPackage;

public class lessons3_4 {
    public static void main(String[] args) {
        int[] mass = {3,6,8,11,13,4,2,5,10,12};

        int sum1 = 0;
        int sum2 = 0;
        int maxNumber1 = 0;
        int maxNumber2 = 0;

        System.out.println("Массив: ");

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("");

        System.out.println("\n" + "Чётные числа массива:");

        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] % 2) == 0) {
                System.out.print(mass[i] + " ");
                if (mass[i] > maxNumber1) {
                    maxNumber1 = mass[i];
                }
                sum1 = sum1 + mass[i];
            }
        }
        System.out.print("\n" + "Max: " + maxNumber1 + " ");
        System.out.print("\n" + "Sum: " + sum1 + " ");


        System.out.println("");
        System.out.println("\n" + "Нечётные числа массива:");

        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] % 2) != 0) {
                System.out.print(mass[i] + " ");
                if (mass[i] > maxNumber2) {
                    maxNumber2 = mass[i];
                }
                sum2 += mass[i];
            }
        }
        System.out.print("\n" + "Max: " + maxNumber2 + " ");
        System.out.print("\n" + "Sum: " + sum2 + " ");
    }
}
