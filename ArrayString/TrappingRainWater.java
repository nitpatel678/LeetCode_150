import java.util.*;
public class TrappingRainWater {
    class Solution {
    public int trap(int[] height) {
       int n = height.length;
       if (n == 0) return 0;
       int left = 0, right = n - 1;
       int leftMax = height[left];
         int rightMax = height[right];
         int waterTrapped = 0;
         while (left<right) {
            if (leftMax<rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                waterTrapped += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                waterTrapped += rightMax - height[right];
            }
            
         }
         return waterTrapped;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}