public class Main{
    public static void main(String args[]){
        CircularLinkedList<String> list = new CircularLinkedList<String>();

        list.insertAtBegining("jobi");
        list.insertAtBegining("joy");
        list.insertAtEnd("Jobin");
        list.display();
    }
}