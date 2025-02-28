//gfg

class Solution {
    void segregate0and1(int[] arr) {
        int zcount = 0;
        int ocount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zcount++;
            } else {
                ocount++;
            }
        }
        int n = 0;
        for (int i = 0; i < zcount; i++) {
            arr[n++] = 0;
        }
        for (int i = 0; i < ocount; i++) {
            arr[n++] = 1;
        }
    }
}
