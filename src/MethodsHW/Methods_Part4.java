package MethodsHW;

public class Methods_Part4 {
    //Task 7.7
    public static void main(String[] args) {
        int numberOfSides = 5;
        double sideLength = 6.0;

        double area = calculatePentagonArea(numberOfSides, sideLength);

        System.out.println("Площадь пятиугольника равна " + area);
    }

    static double calculatePentagonArea(int numberOfSides, double sideLength) {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(sideLength, 2);
    }

}


