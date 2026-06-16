class Solution {
    int[] x = new int[32];

    void toBin(int[] x, int n) {
        int ind = 31;
        while (n > 0) {
            if (n % 2 == 1) {
                x[ind] += 1;
            } else {
                x[ind] += 0;
            }
            n = n / 2;
            ind -= 1;
        }
    }

    boolean checkIthBit(int n, int i) {
        toBin(x, n);
        i = 31 - i;
        return x[i] == 1;
    }
}

public class Second {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkIthBit(10, 1));

    }
}// time complexity -O(logN) space O(1)

class Solution {
    boolean checkIthBit(int n,int i){
        return if(n&(1<<i)!=0);//if((n>>i)&1!=0);
    }
}

public class Second {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkIthBit(10,1));

    }
// time complexity -O(1) space O(1)
