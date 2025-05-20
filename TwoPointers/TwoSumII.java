import java.util.*;

public class TwoSumII {
    // Function to find two numbers in a sorted array that add up to a target
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int [] result = new int[2];
            int left = 0;
            int right = numbers.length - 1;
            while (left<right) {
                int sum = numbers[left]+numbers[right];
                if (sum == target) {
                    result[0] = left + 1;
                    result[1] = right + 1;
                    return result;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }

            }
            return new int[] {-1, -1}; // If no solution found
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}