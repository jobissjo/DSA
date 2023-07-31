
public class Main{
    public static void main(String[] args){
        DoublyLinkedList<Integer> doublyList = new DoublyLinkedList<Integer>();

        doublyList.insertAtBeginning(10);
        doublyList.insertAtBeginning(9);
        doublyList.insertAtBeginning(3);
        doublyList.display();
        doublyList.displayReverse();
        // System.out.println();

        doublyList.insertAtPosition(2,12);
        doublyList.insertAtPosition(1,144);
        doublyList.insertAtPosition(5,6);
        // doublyList.insertAtPosition(7,6);
        

        doublyList.display();
        doublyList.displayReverse();

        System.out.println("delete at postion");
        doublyList.deleteAtPosition(0);
        doublyList.deleteAtPosition(4);
        doublyList.deleteAtPosition(2);

        doublyList.display();
        doublyList.displayReverse();
    }
}