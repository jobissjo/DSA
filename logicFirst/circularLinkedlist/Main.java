public class Main{
    public static void main(String args[]){
        CircularLinkedList<String> list = new CircularLinkedList<String>();

        list.insertAtBegining("jobi");
        list.insertAtBegining("joy");
        list.insertAtEnd("Jobin");
        list.display();
        list.deleteAtBegining();
        list.display();
        list.deleteAtEnd();
        list.deleteAtBegining();
        System.out.println("no element");
        list.display();
        // deleteVal
        list.insertAtBegining("jobi");
        list.insertAtBegining("hello");
        list.insertAtBegining("Hii");
        list.deleteVal("jobi");
        list.deleteVal("Hii");
        // list.deleteVal("hello");
        list.display();


        // insertAfter("somval")
        list.insertAfterVal("hello", "man");
        list.insertAfterVal("hello", "jobi");
        list.display();
        // list.insertAfterVal("man", "sds");
        // list.insertAfterVal("jobi", "sdjl");
        list.display();
        // size
        System.out.println(list.size());

        // contains
        System.out.println(list.contains("hello"));
    }
}