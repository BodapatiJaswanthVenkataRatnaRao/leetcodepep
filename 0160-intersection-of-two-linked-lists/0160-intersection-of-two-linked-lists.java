/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * } 
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        int count1=0;
        ListNode temp1=headA;
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }
        int count2=0;
        ListNode temp2=headB;
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        int ans=Math.abs(count1-count2);
        temp1=headA;
        temp2=headB;
        if(count1>count2){
            for(int i=0;i<ans;i++){
                temp1=temp1.next;
            }
        }
            else{
                for(int i=0;i<ans;i++){
                    temp2=temp2.next;
                }
            }
      while(temp1!=null && temp2!=null){
        if(temp1==temp2){
            return temp1;
        }
        temp1=temp1.next;
        temp2=temp2.next;
      }
      return null;
    }
}