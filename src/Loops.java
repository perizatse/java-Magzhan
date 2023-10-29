import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args) {

        // Task 5.5
        int num = 56;
        boolean isPrime = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        //Task 5.6
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i1 = 0; i1 < 5; i1++) {
            for (int j = 0; j < 10; j++) {
                if (i1 >= j)
                    System.out.print("*");
            }
            System.out.println();
        }


        //Task 5.7
        int c1 = 10, c2 = 1, sum = 0;
        while (c2 <= c1) {
            sum = sum + c2;
            c2++;
        }
        System.out.println("Sum of the natural numbers:" + " " + sum);

        //Task 5.8
        double salary = 500000;
        char grade = 'A';
        switch (grade) {
            case 'A' -> salary *= 1.5;
            case 'B' -> salary *= 1.25;
        }
        System.out.println("Result salary " + salary);

        //Task 5.9
         int number = 5;
         int n0 = 1;
         int n1= 1;
         int n2;
        System.out.print(n0 + " " + n1 + " ");

        for( int i=3; i<= number; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0=n1;
            n1=n2;

        }
    }
}



