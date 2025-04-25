class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        int newdigi[]=new int[digits.length+1];
            while(n>=0){
                if(digits[n]< 9){
                    digits[n]++;
                    return digits;
                }
                digits[n]=0;
                n--;
            }
            newdigi[0]=1;
        return newdigi;
    }
}