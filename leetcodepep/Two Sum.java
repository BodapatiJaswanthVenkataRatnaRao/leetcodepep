import java.util.*;
class Main {
    public static void main(String[] args) {        
        int[] arr={1,2,2,5,6};
        int target=8;
        int[] r=twosum(arr,target);
        System.out.println(Arrays.toString(r));
        
        
    }
    public static int[] twosum(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
        
    }
}