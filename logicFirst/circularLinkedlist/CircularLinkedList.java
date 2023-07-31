import java.lang.IndexOutOfBoundsException;
import java.lang.RuntimeException;

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
        } while(temp != last.next);
        System.out.println();
    }
    public void deleteAtBegining(){
        if (last == null)
            nullChecker();
        if (last.next == last){
            last = null;
        }
        else{
            last.next = last.next.next;
        }
    }

    public void deleteAtEnd(){
        if (last == null){
            nullChecker();
        }
        if (last.next == last){
            last = null;
            return;
        }
        
        else{
            Node temp = last.next;
            while (temp == last){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            last = temp;
        }
    }
    public void deleteVal(T val){
        if (last == null){
            nullChecker();
        }
        else if (last.next == last){
            if (last.data.equals(val))
                last = null;
            return;
        }
        else{
            Node temp = last.next;
            Node prev = last;
            do{
                if (temp.data.equals(val)){
                    if (last == temp)
                        last = prev;
                    prev.next = temp.next;
                    return;   
                }
                prev = temp;
                temp = temp.next;
            } while(temp != last.next);
            System.out.println("No items Found");
        }
    }

    public void insertAfterVal(T exVal, T val){
        if (last == null){
            nullChecker();
        }
        else{
            Node temp = last.next;
            Node newNode = new Node(val);
            do{
                if (temp.data.equals(exVal)){
                    if (last == temp)
                        last = newNode;
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            } while(temp != last.next);
            throw new ValueNotFoundException(exVal+" is not found in list"); 
        }
    }

    public boolean contains(T val){
        boolean isContain = false;
        if(last == null)
            nullChecker();
        Node temp = last.next;
        do{
            if (temp.data.equals(val))
                isContain = true;
            temp = temp.next;
        }while(temp != last.next);
        return isContain;
    }

    private void nullChecker(){
        throw new IndexOutOfBoundsException("List is empty");
    }
    public int size(){
        if(last == null)
            return 0;

        Node temp = last.next;
        int count = 0;
        do{
            temp = temp.next;
            count++;
        } while(temp != last.next);
        
        return count;
    }

    
    
}
class ValueNotFoundException extends RuntimeException {
    public ValueNotFoundException(String message) {
        super(message);
    }
}



