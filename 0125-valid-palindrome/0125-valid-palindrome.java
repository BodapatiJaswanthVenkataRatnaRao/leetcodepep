class Solution {
    public boolean isPalindrome(String s) {
        String r=s.toLowerCase();
        int i=0;
         int j=r.length()-1;
         while(i<j){
            while(i<j && !Character.isLetterOrDigit(r.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(r.charAt(j))){
                j--;
            }


            if(i<j && r.charAt(i)!=r.charAt(j)){
                return false;
            }
            i++;
            j--;
         }
         return true;
    }
}