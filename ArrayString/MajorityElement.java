import java.util.*;
public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            // do variable banao 
            int count = 0;
            int candidate = 0;
            for (int i = 0; i < nums.length; i++) {
                // check karo ki count 0 hai ya nahi
                if (count == 0) {
                    // agar count 0 hai to candidate ko nums[i] se set karo
                    candidate = nums[i];
                }
                if (nums[i] == candidate) {
                    // agar nums[i] candidate ke barabar hai to count ko increment karo
                    count++;
                } else {
                    // agar nums[i] candidate ke barabar nahi hai to count ko decrement karo
                    count--;
                    
                }
            }
            return candidate; // candidate ko return karenge
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}