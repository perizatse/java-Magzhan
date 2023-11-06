public class LoopsHW {
    public static void main(String[] args) {
        // Task 6.1
        int num[] = {1, 3, 4, 1, 5, 5};
        double sum = 0;
        for (int x : num) {
            sum += x;
        }
        System.out.println("среднее арифметическое чисел равно: " + sum / num.length);
        //Task 6.2

        int[] arr = {1, 3, 4, 1, 5, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Дубликаты: " + arr[i]);
                }
            }
        }
        //Task 6.3
        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 23;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i])
                System.out.println("True");
        }
        //Task 6.3.1
        int[] array2 = {1, 3, -6, 23, 14, 2};
        int x1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i])
                System.out.println("False");
        }
        //Task 6.4.1
        int num1 = 23;
        int[] array3 = {1, 3, -6, 23, 14, 2};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (array3[i] == num1) {
                index = i;
            }
        }
        System.out.println("Index = " + index);
        //Task 6.4.2

        int num2 = 5;
        int[] array4 = {1, 3, -6, 23, 14, 2};
        int index1 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (array3[i] == num1) {
                index = i;
            } else {
                System.out.println("Не найдено");
                break;
            }
        }
        //Task 6.5.1
        int[] arr1 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        for (int i = n; i <= m; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("--------");
        //Task 6.5.2
        int arr2[] = {1, 3, -6, 23, 14, 2};
        int n1=1;
        int m1=3;
        for (int i = n1; i <= m1; i++) {
            System.out.println(arr2[i]);
        }

    }
}