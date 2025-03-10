class Solution {
    String removeDuplicates(String s) {
        int[] fr=new int[256];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(fr[s.charAt(i)-'0']==0){
                sb.append(s.charAt(i));
            }
            fr[s.charAt(i)-'0']++;
        }
        return sb.toString();
    }
}
