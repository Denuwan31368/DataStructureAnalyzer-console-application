public class QueueOperations {

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node front, rear;
    private int size;

    public void enqueue(int value) {
        Node n = new Node(value);
        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        size++;
    }

    public Integer dequeue() {
        if (front == null) return null;
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return value;
    }

    public Integer peekFront() {
        return (front == null) ? null : front.data;
    }

    public boolean isEmpty() { return front == null; }
    public int size() { return size; }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front -> rear): [ ");
        Node cur = front;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("]");
    }
}
