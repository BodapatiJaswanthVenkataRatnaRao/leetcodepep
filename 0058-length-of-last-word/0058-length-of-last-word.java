class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
       int lastspace=s.lastIndexOf(' ');
       return s.length()-lastspace-1;

    }
}