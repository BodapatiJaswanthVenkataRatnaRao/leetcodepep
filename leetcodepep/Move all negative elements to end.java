class Solution {
    public void segregateElements(int[] arr) {
        int[] temp=new int[arr.length];
        for(int t=0;t<temp.length;t++){
            temp[t]=arr[t];
        }
        int n=arr.length;
        int k=0;
        for(int i=0;i<arr.length;i++){
             if(temp[i]>=0){
                 arr[k]=temp[i];
                 k++;
             }
             
        
        }
        for(int j=0;j<temp.length;j++){
            if(temp[j]<0){
                arr[k]=temp[j];
                k++;
            }
        }
    }
}