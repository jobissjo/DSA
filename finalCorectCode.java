import java.util.Iterator;
import java.util.Scanner;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        int val, pos;
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n ----- List Menu --------\n");
            System.out.println("1. Insert at the end\n");
            System.out.println("2. Display the list\n");
            System.out.println("3. Insert at specified position\n");
            System.out.println("4. Delete from specified position\n");
            System.out.println("5. Get the length\n");
            System.out.println("6. Delete at the End\n");
            System.out.println("7. Insert at the Beginning\n");
            System.out.println("8. Get the value at index\n");
            System.out.println("9. Update the value at index\n");
            System.out.println("10. Search the value and return the index\n");
            System.out.println("11. Check if value is present in the list\n");
            System.out.println("12. Clear the list\n");
            System.out.println("13. Exit\n");
            System.out.println("\n------------------------------\n");
            System.out.println("Enter your choice:\t");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value: ");
                    val = scanner.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    System.out.println("Using for-each loop:");
                    for (int a : list) {
                        System.out.print(a + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the position you want to enter (starting at 0):");
                    pos = scanner.nextInt();
                    if (pos < 0 || pos > list.length()) {
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.println("Enter the value: ");
                    val = scanner.nextInt();
                    list.insertAtPos(pos, val);
                    break;
                case 4:
                    System.out.println("Enter the position you want to delete (starting at 0):");
                    pos = scanner.nextInt();
                    if (pos < 0 || pos >= list.length()) {
                        System.out.println("Invalid position");
                        break;
                    }
                    list.deleteAtPos(pos);
                    break;
                case 5:
                    System.out.println("Length of Array: " + list.length());
                    break;
                case 6:
                    list.deleteAtEnd();
                    break;
                case 7:
                    System.out.println("Enter the value you want to insert at the first position:");
                    val = scanner.nextInt();
                    list.insertAtBeginning(val);
                    break;
                case 8:
                    System.out.println("Enter the index:");
                    pos = scanner.nextInt();
                    if (pos < 0 || pos >= list.length()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    System.out.println("Value at index " + pos + " is " + list.getIndex(pos));
                    break;
                case 9:
                    System.out.println("Enter the index:");
                    pos = scanner.nextInt();
                    if (pos < 0 || pos >= list.length()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    System.out.println("Enter the value you want to update:");
                    val = scanner.nextInt();
                    list.updateVal(pos, val);
                    break;
                case 10:
                    System.out.println("Enter the value you want to search:");
                    val = scanner.nextInt();
                    int index = list.searchVal(val);
                    if (index == -1) {
                        System.out.println("Value " + val + " not found in the list.");
                    } else {
                        System.out.println("Index of " + val + " is " + index);
                    }
                    break;
                case 11:
                    System.out.println("Enter the value you want to check:");
                    val = scanner.nextInt();
                    System.out.println(val + " is present: " + list.contains(val));
                    break;
                case 12:
                    list.clearList();
                    break;
                case 13:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

class DynamicArray<T> implements Iterable<T> {
    private static final int initialCapacity = 4;
    private T[] arr;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    DynamicArray() {
        size = 0;
        arr = (T[]) new Object[initialCapacity];
        capacity = initialCapacity;
    }

    public void add(T val) {
        if (size == capacity) {
            expandArray();
        }
        arr[size++] = val;
    }

    public void display() {
        System.out.println("Elements in the list:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void expandArray() {
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void insertAtPos(int pos, T val) {
        if (size == capacity) {
            expandArray();
        }
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = val;
        size++;
    }

    public void deleteAtPos(int pos) {
        for (int i = pos + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        if (capacity > 3 * size && size > initialCapacity) {
            shrinkArray();
        }
    }

    private void shrinkArray() {
        capacity /= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public int length() {
        return size;
    }

    public void deleteAtEnd() {
        if (size > 0) {
            arr[size - 1] = null;
            size--;
        }
    }

    public void insertAtBeginning(T val) {
        if (size == capacity) {
            expandArray();
        }
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = val;
        size++;
    }

    public T getIndex(int pos) {
        if (pos >= 0 && pos < size) {
            return arr[pos];
        } else {
            throw new IndexOutOfBoundsException("Index " + pos + " is out of bounds.");
        }
    }

    public void updateVal(int pos, T val) {
        if (pos >= 0 && pos < size) {
            arr[pos] = val;
        } else {
            throw new IndexOutOfBoundsException("Index " + pos + " is out of bounds.");
        }
    }

    public int searchVal(T val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public void clearList() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    public boolean contains(T val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].equals(val)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            public T next() {
                return arr[index++];
            }

            public boolean hasNext() {
                return index < size;
            }
        };
    }
}
