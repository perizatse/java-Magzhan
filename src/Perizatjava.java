public class Perizatjava {
    public static void main(String[] args) {

        if (30 < 10) {
            System.out.println("30 больше, чем 10");
        }
        int a2 = 20;
        int a3 = 40;
        if (a2 < a3) {
            System.out.println(a2 + " меньше " + a3);
        }

        int time = 15;
        if (time > 18) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good afternoon");
        }
        int time1 = 21;
        if (time1 < 11) {
            System.out.println("Good morning");
        } else if (time1 < 20) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Thursday");
                break;
        }
        int day1 = 3;
        switch (day1) {
            case 1:
                System.out.println("Today is a Monday");
            case 2:
                System.out.println("Today is a Tuesday");
            case 4:
                System.out.println("Today is a Wednesday");
            default:
                System.out.println("С нетерпением жду выходных");
        }

    }

}
