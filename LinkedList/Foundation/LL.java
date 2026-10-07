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

    // display
    public void display() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ====> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFrist(5);
        list.addFrist(2);
        list.addFrist(23);
        list.addFrist(12);

        list.display();
    }
}
