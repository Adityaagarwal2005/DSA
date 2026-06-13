class Solution {
    public int isGCD(int n1, int n2) {
        int gcd = 1;
        for (intx = Math.min(n1, n2); x >= 1; x--) {
            if (n1 % x == 0 && n2 % x == 0) {
                gcd = x;
                break;
            }
        }
        return gcd;
    }
}

public class Seven {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isGCD(12, 23));
    }
}
