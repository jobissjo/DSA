

public class LinkedList{
    
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        Node reversedFirst = reverse(first);
        Node reversedSecond = reverse(second);
        Node finalRes = new Node(0);
        Node head = finalRes;
        int carry = 0;
        while(reversedFirst != null && reversedSecond != null){
            int sum = reversedFirst.data + reversedSecond.data + carry;
            if (sum-10 > 0)
                carry = sum - 9;
            else
                carry = 0;
            finalRes.next = new Node(sum - carry);
            finalRes = finalRes.next;
        }
         while(reversedFirst != null){
             finalRes.next = new Node(reversedFirst.data);
             finalRes = finalRes.next;
         }
         
         while(reversedSecond != null){
             finalRes.next = new Node(reversedSecond.data);
             finalRes = finalRes.next;
         }
        
        head = head.next;
        
        return reverse(head);
        
    }
    
    static Node reverse(Node head){
        Node prev = null, next = null;
        Node current = head;
        
        while(current != null){
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        }
        
        return prev;
    }

    class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }
}
