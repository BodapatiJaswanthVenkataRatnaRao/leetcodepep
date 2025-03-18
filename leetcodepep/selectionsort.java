import java.util.*;
class selectionsort{
    public static void main(String args[]) {
        int arr[] = { 5, 22, 55, 25, 2 };
        int[] ans=selection(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}