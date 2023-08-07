import java.lang.IndexOutOfBoundsException;

public class StackUsingLinkedList<T> {
    class Node{
        T data;
        Node next;

        Node(T val){
            data = val;
            next = null;
        }
    }
    Node top;
    StackUsingLinkedList(){
       top = null;
    }

    public void push(T val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public T pop(){
        if (top == null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        T temp = top.data;
        top = top.next;

        return top;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public T peak(){
        return top.data;
    }
}