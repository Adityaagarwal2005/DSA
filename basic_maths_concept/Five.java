///O(N)
class Solution {
    public void isPrintDivisor(int n) {

        for (intx = 1; x <= n; x++) {
            if (n % x == 0) {
                System.out.println(x);
            }

        }
    }
}

public class Five {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPrintDivisor(252));
    }
}

///O(sqrt(N))
class Solution {
    public void isPrintDivisor(int n) {

        for (intx = 1; x * x <= n; x++) {
            if (n % x == 0) {
                System.out.println(x);
                if ((n / x != x)) {
                    System.out.println(n / x);
                }
            }

        }
    }
}

public class Five {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPrintDivisor(252));
    }
}
