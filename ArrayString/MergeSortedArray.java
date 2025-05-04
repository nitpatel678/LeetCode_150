import java.util.*;

public class MergeSortedArray {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // dono array ka size lenge 
            int i = m-1;
            int j = n-1;
            // ek bada array size banayenge
            int k = m+n-1;
            while (i >=0 && j>=0){
                if (nums1[i]>nums2[j]) {
                    nums1[k--]= nums1[i--];
                }
                else {
                    nums1[k--]= nums2[j--];
                }
            }
            // agar nums2 ka array khatam ho gaya hai to nums1 ka array hi rahega
            while (j>=0){
                nums1[k--]= nums2[j--];
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Close the scanner to free resources
            sc.close();
        }
    }
}