import java.util.*;
public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
          // intiliaze the variable 
          int k = 0;
          for (int i = 0; i < nums.length; i++) {
            // check if the element is not equal to the value
            if (nums[i]!=val) {
                nums[k] = nums[i];
                k++;
            }
          }
          return k; // k ko return karenge
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}