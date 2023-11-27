package MethodsHW;

public class MethodsHW {
    public static void main(String[] args) {
        // Task 7.1
        int a = 25;
        int b = 37;
        int c = 29;

        int minNumber = findMinNumber(a, b, c);
        System.out.println("Наименьшее значение: " + minNumber);


        //Task 7.2
        int firstNumber = 25;
        int secondNumber = 45;
        int thirdNumber = 65;

        double average = calculateAverage(firstNumber, secondNumber, thirdNumber);
        System.out.println("Среднее значение: " + average);

        //Task 7.3
        String input = "DarTech123";
        int count1 = countVowels(input);
        System.out.println("Количество гласных букв в строке: " + count1);


        // Task 7.5
        int number = 1223452;
        int count = countTwos(number);
        System.out.println("Количество цифр 2 в числе: " + count);


    }

    //Task 7.1
    public static int findMinNumber(int a, int b, int c) {

        int m = 0;
        if (a <= b && a <= c)
            m = a;
        else if (b <= c && b <= a)
            m = b;
        else if (c <= b && c <= a)
            m = c;
        return m;

        //Task 7.2
    }

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Task 7.3
    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    //Task 7.5
    public static int countTwos(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}


