import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
//Напишите программу, которая проверяет, является ли заданное целое число четным или нечетным, и выводит соответствующее сообщение.

        int q = 155;
        if (q % 2 == 0) {
            System.out.println("Число" + " " + q + " = четное");
        } else {
            System.out.println("Число" + " " + q + " = нечетное");
        }
//Напишите программу, которая сравнивает два целых числа и определяет, какое из них больше.

        int a1 = 40;
        int b1 = 35;
        if (a1 > b1) {
            System.out.println("А больше, чем B");
        } else {
            System.out.println(" A меньше, чем B");
        }
//Напишите программу, которая определяет, является ли заданный год високосным.
        int year = 2013;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
//Напишите программу, которая принимает номер дня недели (1 - Понедельник, 2 - Вторник и так далее) и выводит название дня недели.
        int numday = 1;
        switch (numday) {
            case 1:
                System.out.println("Сегодня понедельник");
                break;
            case 2:
                System.out.println("Сегодня вторник");
                break;
            case 3:
                System.out.println("Сегодня среда");
                break;
            case 4:
                System.out.println("Сегодня четверг");
                break;
            case 5:
                System.out.println("Сегодня пятница");
                break;
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Неверно указан день недели");
                break;
        }
//Напишите программу, которая принимает координаты точки (x, y) и определяет, в каком квадранте координатной плоскости она находится.

        int x = 10;
        int y = 20;

        boolean OneQuarter = (x > 0 && y > 0);
        boolean TwoQuarter = (x < 0 && y > 0);
        boolean ThreeQuarter = (x < 0 && y < 0);
        boolean FourQuarter = (x > 0 && y < 0);

        if (OneQuarter) {
            System.out.println("1");
        } else if (TwoQuarter) {
            System.out.println("2");
        } else if (ThreeQuarter) {
            System.out.println("3");
        } else if (FourQuarter) {
            System.out.println("4");
        }
 //Напишите программу, которая принимает длины трех сторон треугольника и определяет его тип (равносторонний, равнобедренный или разносторонний).
        int a = 20;
        int b = 10;
        int c = 30;


        if ((a == b) && (b == c))

            System.out.println("Треугольник равносторонний");

        else if ((a == b) || (a == c) || (b == c))

            System.out.println("Треугольник равнобедренный");

        else

            System.out.println("Треугольник разносторонний");

    }
}
