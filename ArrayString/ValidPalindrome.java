import java.util.*;
public class ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder newstring = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    newstring.append(Character.toLowerCase(c));
                    
                }
            }
           int left =0, right = newstring.length()-1;
            while (left < right) {
                if (newstring.charAt(left) != newstring.charAt(right)) {
                    return false;
                }
                left++;
                right--;
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