import java.util.Arrays;

public class ArrayOperations {

    private static final int CAPACITY = 50;
    private final int[] data = new int[CAPACITY];
    private int size = 0;

    public boolean isFull() { return size >= CAPACITY; }
    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }

    public boolean insert(int value) {
        if (isFull()) return false;
        data[size++] = value;
        return true;
    }

    private int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) return i;
        }
        return -1;
    }

    public boolean delete(int value) {
        int idx = indexOf(value);
        if (idx == -1) return false;
        for (int i = idx; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return true;
    }

    public int search(int value) {
        return indexOf(value);
    }

    public int[] getSnapshot() {
        return Arrays.copyOf(data, size);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array contents: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("]");
    }
}
