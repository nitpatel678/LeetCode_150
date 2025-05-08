import java.util.*;

public class RemoveDuplicatesSortedArrayII {

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) {
                return nums.length;
            }

            int count = 2;

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[count - 2]) {
                    nums[count] = nums[i];
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input array from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create instance of Solution and call the method
        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        // Print result
        System.out.println("Modified array up to length " + k + ":");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
