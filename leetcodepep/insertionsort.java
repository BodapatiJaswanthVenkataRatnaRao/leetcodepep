class insertionsort {
    public static void main(String args[]){
        int[] arr = {5, 2, 8, 1, 9};
        int[]
    }

    public void int[] insertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {//i=1;v=2
            int j = i;//j-2
            while (j > 0 && arr[j - 1] > arr[j]) {//5>2
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;//02222222
            }
        }
        return arr;
    }
}