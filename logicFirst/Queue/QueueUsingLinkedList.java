public class QueueUsingLinkedList<T>{
    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        } 
    }
    Node rear, front;
        QueueUsingLinkedList(){
            rear = null;
            front = null;
        }

    public void enqeue(T val){
        Node newNode = new Node(val);
        if (front == null)
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
    }

    public T dequeue(){
        if (front == null)
            throw new IndexOutOfBoundsException("Queue is Empty");
        T temp = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        return temp;
    }
}