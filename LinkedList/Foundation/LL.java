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
        // create new Node
        Node newNode = new Node(data);

        // check Empty list
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
        // create temp Node
        Node secondLastNode = head;

        // find second last Node
        while (secondLastNode.next != null) {
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = newNode;
    }

    // add position
    public void add(int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            return;
        }
        // add frist position
        if (pos == 0) {
            addFrist(data);
            return;
        }

        // find position before Node
        Node temp = head;
        for (int i = 0; i < pos - 2 && temp != null; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    // display
    public void display() {
        // check empty list
        if (head == null) {
            return;
        }
        // create temp Node
        Node temp = head;

        // traveling List
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

        // add position
        list.add(9, 5);

        // display call function
        list.display();
    }
}
