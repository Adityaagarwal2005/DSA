class Solution {
  public void countDigit(int n) {
    int output = 0;
    while (n > 0) {
      int x = n % 10;
      output += 1;
      n = n / 10;
    }
    System.out.println(output);
  }
}

public class One {
  public static void main(String[] args) {
    Solution s = new Solution();
    s.countDigit(2564);
  }
}
