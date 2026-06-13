class Solution {
    public boolean isPalindrome(int x) {
        long rev = 0;
        int orig = x;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int last = x % 10;
            x = x / 10;
            rev = (rev * 10) + last;
        }

        return orig == rev;

    }
}

public class Three {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(252));
    }
}