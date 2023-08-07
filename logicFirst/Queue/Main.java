public class Main{
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();

        queue.enqeue(10);
        queue.enqeue(22);
        queue.enqeue(2);
        queue.enqeue(4);
        queue.enqeue(3);
        // queue.enqeue(8);

        try {
            for (int i=0; i<5; i++)
                System.out.println(queue.deque());

        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.err.println("Array is Empty");
        }
    }
}