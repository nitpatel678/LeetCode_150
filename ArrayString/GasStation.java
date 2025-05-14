import java.util.*;

public class GasStation {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int totalGasa = 0;
            // Total gas available
            int totalCost = 0;
            // Total cost to travel
            int currentGas = 0;
            // Current gas available
            int start = 0;
            // Starting point
            for (int i = 0; i < cost.length; i++) {
                totalGasa += gas[i];
                // total gas available
                totalCost += cost[i];
                // total cost to travel
                currentGas += gas[i] - cost[i];
                // current gas available
                if (currentGas < 0) {
                    // If current gas is less than 0, we cannot start from this point
                    start = i + 1;
                    currentGas = 0;
                }

            }
            return (totalGasa < totalCost) ? -1 : start;
            // If total gas is less than total cost, we cannot complete the circuit
            // Otherwise, return the starting point
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}