import java.util.Scanner;
public class Animal {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
