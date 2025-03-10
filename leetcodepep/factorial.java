import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for (int i = n - 1; i > 0; i--) {
            sum = n * i;
            n = sum;
        }
        System.out.println(sum);
    }

}