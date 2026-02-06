package ReturnMiddleNode;

public class ReturnMiddleNode {
    public static void main(String[] args) {
        /*
            Input: head = [1,2,3,4,5]
            Output: [3,4,5]
            Explanation: The middle node of the list is node 3.
        */
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = middleNode(head);
        System.out.println(result.val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while(end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
}

