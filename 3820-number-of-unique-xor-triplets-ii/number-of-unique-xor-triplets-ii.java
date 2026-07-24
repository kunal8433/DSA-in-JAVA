import java.util.*;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n == 1) return 1;

        HashSet<Integer> pairXor = new HashSet<>();
        BitSet ans = new BitSet();

        // Store all unique XORs of pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairXor.add(nums[i] ^ nums[j]);
            }
        }

        // XOR every pair XOR with every number
        for (int x : pairXor) {
            for (int num : nums) {
                ans.set(x ^ num);
            }
        }

        // Triplets with same index (a ^ a ^ a = a)
        for (int num : nums) {
            ans.set(num);
        }

        return ans.cardinality();
    }
}