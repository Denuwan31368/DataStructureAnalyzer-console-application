public class StackOperations {

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node top;
    private int size;

    public void push(int value) {
        Node n = new Node(value);
        n.next = top;
        top = n;
        size++;
    }

    public Integer pop() {
        if (top == null) return null;
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public Integer peek() {
        return (top == null) ? null : top.data;
    }

    public boolean isEmpty() { return top == null; }
    public int size() { return size; }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top -> bottom): [ ");
        Node cur = top;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("]");
    }
}
