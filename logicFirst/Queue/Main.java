public class Main{
    public static void main(String[] args) {
        // QueueUsingArray queue = new QueueUsingArray();

        // queue.enqeue(10);
        // queue.enqeue(22);
        // queue.enqeue(2);
        // queue.enqeue(4);
        // queue.enqeue(3);
        // // queue.enqeue(8);

        // try {
        //     for (int i=0; i<5; i++)
        //         System.out.println(queue.deque());

        // } catch (IndexOutOfBoundsException e) {
        //     // TODO: handle exception
        //     System.err.println("Array is Empty");
        // }

        QueueUsingArrayTwo<String> queue = new QueueUsingArrayTwo<String>();
        queue.enqeue("Hello");
        queue.enqeue("Jobi");
        queue.enqeue("Ivar");
        queue.enqeue("is coming");
        queue.enqeue("you");

        for(int i=0; i<5; i++){
            System.out.println(queue.dequeue());
        }
        // queue.dequeue();

        QueueUsingLinkedList<Integer> queue1 = new QueueUsingLinkedList<Integer>();
        queue1.enqeue(3);
        queue1.enqeue(5);
        queue1.enqeue(6);
        queue1.enqeue(7);

        for(int i=0; i<4; i++)
            System.out.println(queue1.dequeue());

    }
}