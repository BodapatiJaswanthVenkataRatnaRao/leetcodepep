import java.util.LinkedList;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static class Linked{
        Node head;
        Node tail;
        int size;

        public Linked(){
            head = null;
            tail = null;
            size = 0;
        }
        public void addatlast(int val){
            if(size==0){
                Node node=new Node(val);
                head=node;
                tail=node;
                size++;
                return;
            }
            else{
                Node node=new Node(val);
                tail.next=node;
                tail=node;
                
            }
            size++;
        }
        void printlist(){
            if(size==0){
                System.out.println("nothing in linkedlist");
            }
            else{
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                    }
            }
        }


    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addatlast();

        // Node head = new Node(1);
        // Node second = new Node(2);
        // Node third = new Node(3);
        // head.next = second;
        // second.next = third;
        // Node temp = head;
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

    }

}