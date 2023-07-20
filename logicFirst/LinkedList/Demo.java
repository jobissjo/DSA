public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insertAtBeginning(10);
        list.insertAtBeginning(12);
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.display();
        list.insertAtPosition(4, 67);
        list.display();
        list.insertAtPosition(0, 35);
        list.display();
        list.deleteAtPosition(2);
        list.display();
        list.deleteAtPosition(1);
        list.display();
        list.deleteAtPosition(3);
        list.display();
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        list.updatePos(0, 10);
        list.display();
        list.deleteAtEnd();
        list.deleteAtEnd();
        list.display();
        // list.deleteAtEnd();
        list.display();
        list.insertAtEnd(2);
        list.insertAtEnd(1);

        list.display();
        list.updatePos(1, 5);
        System.out.println(list.contains(1));
        System.out.println(list.search(1));
        list.display();
        System.out.println("list ");
        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println();
        list.reverse();
        System.out.print("Reversed list : ");
        list.display();
    }

}