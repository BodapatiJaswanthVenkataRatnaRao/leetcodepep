class Solution {
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        int fnum = 0;
        int snum = 1;
        int tnum = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = fnum + snum + tnum;
            fnum = snum;
            snum = tnum;
            tnum = sum;
        }
        return sum;
    }
}