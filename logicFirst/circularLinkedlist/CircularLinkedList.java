public class CircularLinkedList<T>{
    Node last;

    class Node{
        T data;
        Node next;

        Node(T val){
            data = val;
            next = null;
        }
    }

    CircularLinkedList(){
        last = null;
    }

    public void insertAtBegining(T val){
        Node newNode = new Node(val);

        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }
        else{
            newNode.next = last.next;
            last.next =newNode;
        }
    }

    public void insertAtEnd(T val){
        Node newNode = new Node(val);

        if(last == null){
            newNode.next = newNode;
            last = newNode;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display(){
        if(last == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next;


        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp.next != last);
        System.out.println();
    }
    
}