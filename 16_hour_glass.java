import java.util.*;

public class 16_hour_glass {

    static int hourglassSum(int[][] arr) {

        // Step 1: Initialize maximum sum to the smallest possible value
        int maxSum = -63;

        // Step 2: Loop through possible starting positions of hourglass
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                // Step 3: Calculate current hourglass sum
                int currentSum =
                        arr[i][j]     + arr[i][j + 1]     + arr[i][j + 2]
                                          + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                // Step 4: Update maximum sum
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        // Step 5: Return the maximum hourglass sum
        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[6][6];

        // Step 6: Read input
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 7: Call function and print result
        System.out.println(hourglassSum(arr));

        sc.close();
    }
}
