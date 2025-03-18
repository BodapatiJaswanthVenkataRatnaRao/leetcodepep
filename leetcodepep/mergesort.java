import java.util.*;
class Solution {

   public static void mergeSort(int arr[], int l, int r) {
        while(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int arr[],int l,int mid,int r){
        ArrayList<Integer> t=new ArrayList<>();
        int left=l;
        int right=mid+1;
        
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                t.add(arr[left]);
                left++;
            }
            else{
                t.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            t.add(arr[left]);
            left++;
        }
        while(right<=r){
            t.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=t.get(i-l);
        }
    }
}