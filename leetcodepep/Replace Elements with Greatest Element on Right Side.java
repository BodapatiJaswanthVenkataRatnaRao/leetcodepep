class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxe=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
             arr[i]=maxe;
             maxe=maxe<temp?temp:maxe;     
        }
        return arr;
    }
}