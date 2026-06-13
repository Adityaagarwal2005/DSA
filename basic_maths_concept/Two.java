class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int last = x % 10;
            x = x / 10;
            rev = (rev * 10) + last;
        }
        return rev;
    }
}

public class Two {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(256));
    }
}