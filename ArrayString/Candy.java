import java.util.*;
public class Candy {
    // Problem: https://leetcode.com/problems/candy/
    // Description: N students are standing in a line. Each student has a rating given in the integer array ratings.
    // You need to give candies to the students. The following rules apply:
    // 1. Each student must have at least one candy.
    // 2. Students with a higher rating get more candies than their neighbors.
    // Return the minimum number of candies you need to have to distribute the candies to the students.
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // Har student ko kam se kam 1 candy

        // Left to Right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to Left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}