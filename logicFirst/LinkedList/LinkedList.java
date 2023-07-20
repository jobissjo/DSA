import java.lang.IllegalArgumentException;
import java.lang.IndexOutOfBoundsException;
import java.util.Iterator;

import org.w3c.dom.Node;

import java.lang.Integer;
public class LinkedList<T> implements Iterable<T>{
    Node head;

    LinkedList() {
        head = null;
    }

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }

    }

    public void insertAtBeginning(T val) {

        Node newNode = new Node(val);
        // If List is empty
        if (head == null) {
            head = newNode;
        }
        // If list is not empty
        else {
            newNode.next = head;
            head = newNode;
        }

    }
    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertAtPosition(int pos, T val){
        if (pos == 0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i=0; i<pos-1; i++){
            temp = temp.next;
            if(temp == null){
                throw new IllegalArgumentException("Argument of position "+pos+" is wrong ");
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPosition(int pos){
        if (head == null){
            throw new IndexOutOfBoundsException("Deletetion is not possible in empty list");
        }
        if (pos == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prevNode = null;

        for (int i=0; i< pos; i++){
            prevNode = temp;
            temp = temp.next;
        }

        prevNode.next = temp.next;
    }

    public T get(int pos){
        checkListEmpty(pos);
        Node temp = head;
        for (int i=0; i < pos;i++){
            if(temp.next == null){
                throw new IndexOutOfBoundsException("List is out of range, can't get index "+pos);
            }
            temp = temp.next;
        }
        return temp.data;
    }
    public void updatePos(int pos, T val){
        checkListEmpty(pos);
        Node temp = head;
        for (int i=0; i < pos;i++){
            if(temp.next == null){
                throw new IndexOutOfBoundsException("List is out of range, can't get index "+pos);
            }
            temp = temp.next;
        }
        temp.data = val;
    }
    public void deleteAtEnd(){
        // checkListEmpty(0);
        if(head.next == null){
            head.data = null;
            return;

        }
        Node temp = head;
        Node prevNode = null;
        while(temp.next != null){
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
    }
    public void insertAtEnd(T val){
        Node newNode = new Node(val);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int search(T val){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == val){
                return i;
            }
            if(temp.next == null){
                break;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public boolean contains(T val){
        boolean is_contain = false;
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                is_contain = true;
            }
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        return is_contain;
    }
    private void checkListEmpty(int pos){
        if(head == null){
            throw new IndexOutOfBoundsException("List is Empty, so can't get index "+pos);
        }
    }
    public void reverse(){
        Node Previous = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = Previous;
            Previous = current;
            current = next;
        }
        head = Previous;
    }
    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node temp = head;
            public boolean hasNext(){
                return temp != null;

            }
            public T next(){
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }
}