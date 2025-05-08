import java.util.*;

public class JumpGameII {
    class Solution {
        public int jump(int[] nums) {
           int jump = 0;
           // kitni jump kiye hain
           int currEnd = 0;
           // abhi kaha par hai
           int farthest = 0;
           // kitna dur jaa skte hai
           for (int index = 0; index < nums.length; index++) {
            farthest = Math.max(farthest, index + nums[index]);
            // abhi tak ki sabse door
            if (index == currEnd) {
                jump++;
                currEnd = farthest;
                // abhi tak ki sabse door tak pahuch gaye
            }
           }
           return jump;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}