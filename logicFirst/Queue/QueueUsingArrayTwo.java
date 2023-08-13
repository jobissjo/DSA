public class QueueUsingArrayTwo<T>{
    static final int MAX_SIZE = 30;
    T[] arr;
    int rear;
    QueueUsingArrayTwo(){
        arr = (T[]) new Object[MAX_SIZE];
        rear = -1;
    }

    public void enqeue(T val){
        if(rear == MAX_SIZE -1)
            throw new IndexOutOfBoundsException("Array is full");
        arr[++rear] = val;
    }

    public T dequeue(){
        if (rear == -1)
            throw new IndexOutOfBoundsException("Array is Empty");
        
        T temp = arr[0];
        for (int i = 0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return temp;
    }

}