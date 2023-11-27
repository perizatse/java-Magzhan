package MethodsHW;

public class Methods_Part5 {
    // Task 7.8
    public static void main(String[] args) {
        int number = 252;
        int sum = calculateDigitSum(number);
        System.out.println("Сумма цифр числа равна " + sum);
    }

    static int calculateDigitSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
