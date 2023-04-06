package DSA.Linkedlist;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1);
        System.out.println(l2);
        ListNode result = new ListNode(0,null);
        while(l1!= null & l2!= null){
            result.val = l1.val+ l2.val;
            ListNode temp = new ListNode(0,null);
            result.next = temp;
        }
        return result;
    }
}

public class AddTwoNumbersLeetcode2 {
    public static void main(String[] args){
        ListNode obj = new ListNode();
        obj.addTwoNumbers(new ListNode(2), new ListNode(23));
    }
}
