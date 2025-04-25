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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
        int min=count/k;
        int extra=count%k;
        ListNode[] res=new ListNode[k];
        ListNode current=head;
        for(int i=0;i<k;i++){
            if(current==null){
                res[i]=null;
                continue;
            }
            res[i]=current;
            int partsize=min+(extra>0?1:0);
            extra--;

            ListNode prev=null;
            for(int j=0;j<partsize;j++){
                prev=current;
                current=current.next;

            }
            if(prev!=null) prev.next=null;
        }
        return res;
    }
}