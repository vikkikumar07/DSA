package LinkedList.Questions;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class L203 {

    public static ListNode removeElements(ListNode head, int val) {

        // Remove matching nodes from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        // Remove matching nodes from the middle/end
        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        int val = 6;

        // head = [1,2,6,3,4,5,6]
        ListNode head = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                6,
                                new ListNode(
                                        3,
                                        new ListNode(
                                                4,
                                                new ListNode(
                                                        5,
                                                        new ListNode(6)))))));

        head = removeElements(head, val);

        // Print linked list
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}