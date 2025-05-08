import java.util.*;
public class JumpGame {
    class Solution {
        public boolean canJump(int[] nums) {
            // ek variable reachable ko 0 se initialize karte hain
            // jo ki hamesha 0 index se start hota hai
            // aur isko hum check karte hain ki kya hum us index tak pahunch sakte hain ya nahi
            int reachable = 0;
            for (int i = 0; i < nums.length; i++) {
                // agar i index tak nahi pahunch sakte hain
                // toh hum false return karte hain
                // agar i index tak pahunch sakte hain toh hum reachable ko update karte hain
                // aur check karte hain ki kya hum last index tak pahunch sakte hain ya nahi
                if (i > reachable) {
                    return false;
                }
                // agar hum i index tak pahunch gaye hain toh hum reachable ko update karte hain
                // aur check karte hain ki kya hum last index tak pahunch sakte hain ya nahi
                // reachable ko update karte hain
                reachable = Math.max(reachable, i + nums[i]);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}