class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n=new ListNode();
        ListNode current=n;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                current.next=list1;
                list1=list1.next;
            }
            else{
…        }
        return n.next;
    }
}