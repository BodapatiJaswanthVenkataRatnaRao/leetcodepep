//gfg
public void sort012(int[] arr) {
    int zcount = 0;
    int ocount = 0;
    int tcount = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            zcount++;
        } else if (arr[i] == 1) {
            ocount++;
        } else {
            tcount++;
        }
    }
    int n = 0;
    for (int i = 0; i < zcount; i++) {
        arr[n++] = 0;
    }
    for (int i = 0; i < ocount; i++) {
        arr[n++] = 1;
    }
    for (int i = 0; i < tcount; i++) {
        arr[n++] = 2;
    }
}