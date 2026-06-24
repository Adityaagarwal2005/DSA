public class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;
        for (int i = 0; i <= 31; i++) {
            if ((ans & (1 << i)) != 0) {
                count++;
            }

        }
        return count;
    }
}

public class Five{
    Solution s = new Solution();
    System.out.println(s.minBitFlips(10, 20));
}