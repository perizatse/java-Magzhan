import java.sql.SQLOutput;

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
            if (x == array[i]) System.out.println("True");
        }
        //Task 6.3.1
        int[] array2 = {1, 3, -6, 23, 14, 2};
        int x1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) System.out.println("False");
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
        int n1 = 1;
        int m1 = 3;
        for (int i = n1; i <= m1; i++) {
            System.out.println(arr2[i]);
        }
        //Task 6.6
        int arr3[] = {1, 3, -6, 23, 14, 2};
        int min = arr3[0], max = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (max < arr3[i]) max = arr3[i];
            if (min > arr3[i]) min = arr3[i];
        }
        System.out.println(max + " " + min);
        //Task 6.7

        int arr5[] = {1, 3, -6, 23, 14, 2};
        int min1 = arr5[0], min2 = min1;
        for (int i = 0; i < arr5.length; i++) {
            if (min1 > arr5[i]) {
                min2 = min1;
                min1 = arr5[i];
            }
        }
        System.out.println(min1 + " " + min2);

//Task 6.8
        int[] arr4 = {1, 2, 3, 0, 4, 6};
        int max1 , k = -1;
        String result = "";
        for (int j = 0; j < arr4.length; j++) {
            max1=-1;
            for (int i = 0; i < arr4.length; i++) {
                if (arr4[i] >= 0 && max1 < arr4[i]) {
                    max1 = arr4[i];
                    k = i;
                }
            }
            if (k >= 0) {
                arr4[k] = -1;
            }
            result += max1;
        }

        System.out.println(result);
    }
}




