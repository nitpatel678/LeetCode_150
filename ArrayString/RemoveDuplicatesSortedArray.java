import java.util.*;
public class RemoveDuplicatesSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0; // Agar array khali hai to 0 return karo
            }
            int count = 1; // Unique elements ka count
            for (int i = 1; i < nums.length; i++) {
                if (nums[i]!= nums[i-1]) {
                    nums[count] = nums[i]; // Unique element ko array me set karo
                    count++; // Agar current element previous se alag hai to count increment karo
                }
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}