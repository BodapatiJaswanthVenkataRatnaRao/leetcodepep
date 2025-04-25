class Solution {
    public int firstUniqChar(String s) {
        int[] fr=new int[26];
        for(int i=0;i<s.length();i++){
             fr[s.charAt(i)-97]++;
        }
        for(int i=0;i<s.length();i++){
            if(fr[s.charAt(i)-97]==1){
                return i;
            }

        }

        return -1;
    }
}