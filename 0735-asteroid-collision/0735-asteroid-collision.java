class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
            while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                st.pop();
                continue;
            }
            if(st.isEmpty() || st.peek()<0){
                st.push(asteroids[i]);
            }
            }
        }
        int[] result=new int[st.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result;
    }
}