class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if(low<high){
           int pi= partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
              
        }
    } 
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int arr[], int low, int high) {
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j){
            while(i<=high && arr[i]<=pivot ){
                i++;
            }
            while(j>=low && arr[j]>pivot ){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
            
        }
        swap(arr,low,j);
        return j;
    }
}
