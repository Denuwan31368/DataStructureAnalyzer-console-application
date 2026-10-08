
public class LinkedListOperations {

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head;
    private int size;

    public boolean isEmpty() { return head == null; }
    public int size() { return size; }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = newNode;
        }
        size++;
    }

    public boolean delete(int value) {
        Node cur = head, prev = null;
        while (cur != null) {
            if (cur.data == value) {
                if (prev == null) head = cur.next;
                else prev.next = cur.next;
                size--;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public int search(int value) {
        Node cur = head;
        int index = 0;
        while (cur != null) {
            if (cur.data == value) return index;
            cur = cur.next;
            index++;
        }
        return -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.print("Linked list: [ ");
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("]");
    }
}
