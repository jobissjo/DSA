import java.lang.IllegalArgumentException;
import java.lang.IndexOutOfBoundsException;
import java.util.Iterator;

import org.w3c.dom.Node;

import java.lang.Integer;
public class DoublyLinkedList<T> implements Iterable<T>{
    Node head;
    Node tail;

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    class Node {
        T data;
        Node next;
        Node previous;

        Node(T val) {
            data = val;
            next = null;
            previous = null;
        }

    }

    public void insertAtBeginning(T val) {

        Node newNode = new Node(val);
        // If List is empty
        if (head == null) {
            tail = newNode;
        }
        // If list is not empty
        else {
            newNode.next = head;
            head.previous = newNode;
        }
        head = newNode;

    }
    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();

    }

    public void insertAtPosition(int pos, T val){
        if (pos == 0){
            insertAtBeginning(val);
            return;
        }
        Node newNode =  new Node(val);
        Node temp = head;
        for (int i=0; i< pos-1; i++){
            temp = temp.next;
            if(temp == null){
                throw new IndexOutOfBoundsException("Argument of position "+pos+" is wrong ");
            }
        }

        if (temp.next == null){
            temp.next = newNode;
            newNode.previous = temp;
            tail = newNode;
            return;
        }
        newNode.next = temp.next;
        newNode.previous = temp;
        temp.next.previous = newNode;
        temp.next = newNode;

    }
    public void deleteAtPosition(int pos){
        if (head == null){
            throw new IndexOutOfBoundsException("Deletetion is not possible in empty list");
        }
        if (pos == 0){
            head = head.next;
            if(head.next == null){
                tail = null;
            }
            else
                head.previous = null;
                // System.out.println("nulled");
            return;
        }
        Node temp = head;
        Node prevNode = null;

        for (int i=0; i< pos; i++){
            prevNode = temp;
            temp = temp.next;
            if(temp == null){
                throw new IndexOutOfBoundsException("Deletetion is not possible, because index is out of range");
            }
        }

        
        if(temp.next == null){
            prevNode.next = null;
            tail = prevNode;
            return;
        }
        else
            prevNode.next = temp.next;
        temp.next.previous = prevNode;
    }

    // public T get(int pos){
    //     checkListEmpty(pos);
    //     Node temp = head;
    //     for (int i=0; i < pos;i++){
    //         if(temp.next == null){
    //             throw new IndexOutOfBoundsException("List is out of range, can't get index "+pos);
    //         }
    //         temp = temp.next;
    //     }
    //     return temp.data;
    // }
    // public void updatePos(int pos, T val){
    //     checkListEmpty(pos);
    //     Node temp = head;
    //     for (int i=0; i < pos;i++){
    //         if(temp.next == null){
    //             throw new IndexOutOfBoundsException("List is out of range, can't get index "+pos);
    //         }
    //         temp = temp.next;
    //     }
    //     temp.data = val;
    // }
    // public void deleteAtEnd(){
    //     // checkListEmpty(0);
    //     if(head.next == null){
    //         head.data = null;
    //         return;

    //     }
    //     Node temp = head;
    //     Node prevNode = null;
    //     while(temp.next != null){
    //         prevNode = temp;
    //         temp = temp.next;
    //     }
    //     prevNode.next = null;
    // }
    // public void insertAtEnd(T val){
    //     Node newNode = new Node(val);
    //     Node temp = head;

    //     while(temp.next != null){
    //         temp = temp.next;
    //     }
    //     temp.next = newNode;
    // }

    // public int search(T val){
    //     Node temp = head;
    //     int i=0;
    //     while(temp != null){
    //         if(temp.data == val){
    //             return i;
    //         }
    //         if(temp.next == null){
    //             break;
    //         }
    //         temp = temp.next;
    //         i++;
    //     }
    //     return -1;
    // }

    // public boolean contains(T val){
    //     boolean is_contain = false;
    //     Node temp = head;
    //     while(temp != null){
    //         if(temp.data == val){
    //             is_contain = true;
    //         }
    //         if(temp.next == null){
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     return is_contain;
    // }
    // private void checkListEmpty(int pos){
    //     if(head == null){
    //         throw new IndexOutOfBoundsException("List is Empty, so can't get index "+pos);
    //     }
    // }
   
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