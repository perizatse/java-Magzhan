import java.util.Scanner;
public class Magzhan_java {
    public static void main(String[] args) {
        System.out.println("Hello world");// моя первая написанная программа.
//однострочный комментарий
        /*
        первая строка
        вторая строка
        многострочный комментарий
         */
        String flowersName = "Roses";
        int flowersNumber = 101;
        System.out.println(flowersName);
        System.out.println(flowersNumber);
        int a = 10;
        int b = 15;
        System.out.println(a + b);
        int x = 20;
        int y = 10;
        int z = x + y;
        System.out.println(z);
        int q = 1, w = 2, e = 3, r = 4;
        System.out.println(q + w + e + r);
        //переменная с разными значениями
        int s = 10, d = 10, f = 10, g = 10;
        System.out.println(s + d + f + g);
        //один тип с одинаковыми значениями
        double myDouble;
        myDouble = 2.5;
        System.out.println(myDouble);
//Объявление дабла и его дальнейшая инициализация
        byte ba = 100;
        short sh = 101;
        int black = 10001;
        long white = 1000000001;
        double yourDouble = 3.5;
        float myFloat = 3.6f;
        boolean tiktak = true;
        char ch = 'S';
        String lays = "Hello Kitty";
//примеры переменных
        int сhacha = 100;
        long bo = сhacha;
        //пример расширяющегося приведения
        int fu = 100;
        byte as = (byte) fu;
//пример сужающегося приведения
        final double GRAVITY = 9.8;
        final double PI = 3.14;
        final String MY_CITY = "Almaty";
        //пример констант

        int int1 = 10;
        int int2 = 5;
        int int3 = (int1 * int2);
        System.out.println(int3);

        int int4 = 10;
        float fl1 = 2.5f;
        float fl2 = int4 / fl1;
        System.out.println(fl2);

        int lenght = 15;
        int wight = 9;
        int square = lenght * wight;
        int perimeter = 2 * (lenght + wight);

        int ix = 10;
        ++ix;
        ix++;
        System.out.println(ix);

        ix += 5;

        int int7 = 25;
        int int8 = 43;
        boolean b1 = int7 == int8;
        System.out.println(b1);

        int op1 = 10;
        int op2 = 5;
        int result1 = op1 + op2;
        int result2 = op1 - op2;
        int result3 = op1 * op2;
        int result4 = op1 / op2;
        int result5 = op1 % op2;
        System.out.println(result5);


        double fahrenheit = 200;
        double celsius = 0.0;
        celsius = (fahrenheit - 32) / 1.8;
        System.out.println("Значение в градусах цельсия = " + celsius);

        int po = 451;
        po += 10;
        po /= 3;
        Math.abs(po);
        po += 5;
        po *= 5;
        System.out.println(po);


        int lenght1 = 10;
        int wight1 = 20;
        if (lenght == wight) {
            System.out.println("It's a square");
        } else {
            System.out.println("It's a not square");
        }

        int price=15;
        if (price>5000){
            System.out.println("You have a 10 % discount");
        }else {
            System.out.println("You don't have disount");


            int grade = 33;
            if (grade <= 25) {
                System.out.println("Ваша оценка F");
            } else if (grade <= 45) {
                System.out.println("Ваша оценка E");
            } else if (grade <= 50) {
                System.out.println("Ваша оценка D");
            } else if (grade <= 60) {
                System.out.println("Ваша оценка C");
            } else if (grade <= 80) {
                System.out.println("Ваша оценка B");
            } else if (grade > 80) {
                System.out.println("Ваша оценка A");
            }

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n > 0) {
                System.out.println("Это простое число");
            }
        }




    }
}












