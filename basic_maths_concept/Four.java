class Solution {
    public boolean isArmstrong(int x) {
        int sum = 0;
        int orig = x;

        while (x > 0) {
            int last = x % 10;
            x = x / 10;
            sum = sum + (last * last * last);
        }

        return orig == sum;

    }
}

public class Four {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isArmstrong(252));
    }
}