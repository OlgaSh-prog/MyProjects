package Lesson7_2020_06_06;

public class Weights {

    public static void main(String[] args) {

        String allWeights = "27.04 - 67.7, 28.04 - 68.0, 29.04 - 67.7, 30.04 - 67.4, 01.05 - 67.8, 02.05 - 68.0, 03.05 - ?, 04.05 - 68.4, 05.05 - 67.9, 06.05 - 67.4, " + "\n" +
                "07.05 - 67.3, 08.05 - 67.8, 09.05 - 67.2, 10.05- 68.0, 11.05 - 68.2, 12.05 - 68.3, 13.05 - 68.0, 14.05 - 68.2, 15.05 - 67.6, 16.05 - 67.5, " + "\n" +
                "17.05 - 67.5, 18.05 - 67.5, 19.05 - 67.5, 20.05 - 67.5, 21.05 - 68.0, 22.05 - 67.4, 23.05 - ?, 24.05 - 67.2, 25.05 - 67.4, 26.05 - 67.2, " + "\n" +
                "27.05 - ?, 28.05 - 67.3, 29.05 - ?, 30.05 - ?, 31.05 - 68.1, 01.06 - 67.7, 02.06 - 67.4, 03.06 - 67.1";


        String[] dates = allWeights.split("");
        allWeights = allWeights.replace(", "," | ");
        allWeights = allWeights.replace(" ?"," 0.0");

        System.out.println("All Weights: " + "\n" + allWeights);

        double[] weights = {67.7, 68.0, 67.7, 67.4, 67.8, 68.0, 0.0, 68.4, 67.9, 67.4, 67.3, 67.5, 67.5, 68.0,
                67.8, 67.2, 68.0, 68.2, 68.3, 68.0, 68.2, 67.6, 67.5, 67.5, 67.5, 67.4, 0.0, 67.2, 67.4, 67.2,
                0.0, 67.3, 0.0, 0.0, 68.1, 67.7, 67.4, 67.1};

        int cnt = 0;
        double sum = 0;
        double sum1 = 0;

        //System.out.println("Size:" + weights.length);

        System.out.println("\n" + "Counting: ");

        for (int j = 0; j < weights.length; j++){
            if (weights[j]!=0){
                cnt++;
            System.out.print(weights[j] + " | ");
            sum += weights[j];
            System.out.println("Sum = " + sum);
            }
        }

        sum1 = sum / cnt;
        System.out.println("Average = " + sum1);

    }
}
