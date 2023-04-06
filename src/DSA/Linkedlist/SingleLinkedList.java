package DSA.Linkedlist;

class LinkedList
{
    Node head;  // head of list

    /* Node Class */
    class Node
    {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {data = d; next = null; }
    }
    public void InsertionFirst(int new_data)
    {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public Node ReturnLastNode(){
        Node n = head;
        Node temp = head;
        while(n!=null){
            temp = n;
            n = n.next;
        }
        System.out.println("lastnode "+ temp.data);
        return temp;
    }
    public void InsertionLast(int new_data)
    {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = null;
        Node lastNode = ReturnLastNode();
        lastNode.next = new_node;

        /* 4. Move the head to point to new Node */
    }

    public void display(){
        Node h= head;
        while(h!=null){
            System.out.println(h.data + " ");
            h=h.next;
        }
    }
}

public class SingleLinkedList {
   public static void main(String[] args){
       System.out.println("main method started");
       LinkedList obj = new LinkedList();
       obj.InsertionFirst(3);
       obj.InsertionFirst(2);
       obj.InsertionFirst(1);
       obj.InsertionLast(4);

       obj.ReturnLastNode();
       obj.display();
   }

}
