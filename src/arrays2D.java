
public class arrays2D {
    public static void main(String[] args) {
        //Task 6.2.9
        int[][] arr = {{10, 20, 30}, {40, 50, 60}};
        int[][] res = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                res[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        //Task 6.2.10
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                sum += arr2[i][j];
            }
        }
        System.out.println(sum);

        //6.2.11
        int[][] arr3 = {{10, 20, 30}, {40, 50, 60}};
        if (arr3.length == arr[0].length) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //6.2.12
        int n = 5;
        int[][] arr1 = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr1[i - 1][j - 1] = i * j;

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

//Task 6.2.13

        int[][] arr4 = {{10, 20, 30}, {40, 50, 60}};
        int min = arr4[0][0], max = min;


        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0;j < arr4[0].length; j++) {
                if (max < arr4[i][j])
                    max = arr4[i][j];
                if (min > arr4[i][j])
                    min = arr4[i][j];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }

}
