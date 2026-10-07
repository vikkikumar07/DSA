package LinkedList.Foundation;

public class LL {
    // Node Class
    class Node {
        int data;
        Node next;

        // constracter
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head frist time create null
    Node head = null;

    // add frist
    public void addFrist(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data);

        // check empty list
        if (head == null) {
            return;
        }
        Node secondLastNode = head;

        // find second last Node
        while (secondLastNode.next != null) {
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = newNode;
    }

    // display
    public void display() {
        // check empty list
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ====> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LL list = new LL();

        // add frist call function
        list.addFrist(4);
        list.addFrist(3);
        list.addFrist(2);
        list.addFrist(1);

        // add list call function
        list.addLast(5);
        list.addLast(6);

        // display call function
        list.display();
    }
}
