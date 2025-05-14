import java.util.*;

public class InsertDeleteGetRandom {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random rand;

    public InsertDeleteGetRandom() {
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
        this.rand = new Random(); // Optional optimization
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, list.size());
            // list.size() is the index where we will insert the new value
            // Add the new value to the end of the list
            // This is O(1) because we are adding to the end of the list
            // and not shifting elements
            // This is the main optimization of this solution
            // We are using a list to store the values
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            int index = map.get(val);
            int lastElement = list.get(list.size() - 1);

            // Move last element to the place of the element to delete
            list.set(index, lastElement);
            map.put(lastElement, index);

            // Remove last element
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }

    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}