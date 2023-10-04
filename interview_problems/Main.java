public class Main {
    class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        Node firstNode = new Node(5);
        firstNode.next = new Node(7);
        firstNode.next = new Node(2);

        Node secondNode = new Node(5);
        firstNode.next = new Node(7);
        firstNode.next = new Node(2);

        li.addTwoLists(firstNode, secondNode);

    }
}
