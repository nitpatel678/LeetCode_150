import java.util.*;

public class ReverseWordsString {
    class Solution {
        public String reverseWords(String s) {
            int n = s.length();
            StringBuilder result = new StringBuilder();
            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != ' ') {
                    temp.append(s.charAt(i));
                } else {
                    if (temp.length() > 0) {
                        result.insert(0, temp.toString());
                        result.insert(0, " ");
                        temp.setLength(0);
                    }
                }
            }

            // Append the last word
            if (temp.length() > 0) {
                result.insert(0, temp.toString());
            }

            return result.toString().trim();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}