/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode current=head;
        ListNode prev=null;
        int count=0;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        if(count<k){
            return head;
        }
        for(int i=k;i>0;i--){
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;

        }
        head.next=reverseKGroup(current,k);
        return prev;
    }
}