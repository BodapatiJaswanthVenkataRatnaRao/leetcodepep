import java.util.*;

public class insertlist {
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

        public static Node insertbeginning(Node head, int data) {
            Node newnode = new Node(data);
            newnode.next = head;
            return newnode;
        }

        public static Node middleinsert(Node second,Node third,int data){
            Node midnode = new Node(data);
            second.next=midnode;
            midnode.next=third;
            return midnode;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        head =Node.insertbeginning(head, 0);
        Node midnode = Node.middleinsert(second,third,5);

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}
