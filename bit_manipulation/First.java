class Solution {
    void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

}

public class First {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.swap(20, 31);

    }
}