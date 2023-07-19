import java.util.Iterator;
import java.util.Scanner;

public class DynamicArrayDemo{
    public static void main(String[] args) {
        int val, pos ;
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n ----- List Menu --------\n");
            System.out.println("1.Insert at the end\n");
            System.out.println("2.Display the list\n");
            System.out.println("3.Insert at specified position\n");
            System.out.println("4.Delete from specified position\n");
            System.out.println("5.Get the length\n");
            System.out.println("6.Delete at the End\n");
            System.out.println("7.Insert at the Begining\n");
            System.out.println("8.Get the value of index\n");
            System.out.println("9.update the value of index\n");
            System.out.println("10.Search the value and return the index\n");
            System.out.println("11.Check value contains in the list\n");
            System.err.println("12.clear the list\n");
            System.out.println("13.Exit\n");
            System.out.println("\n------------------------------\n");
            System.out.println("Enter your choice:\t");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:System.out.println("Enter the value: ");
                    val = scanner.nextInt();
                    list.add(val);
                    break;
                case 2:list.display();
                    System.out.println("From for each"); 
                    for(int a:list){
                        System.out.print(a+ " ");
                    }
                    break;
                case 3: System.out.println("Enter the position you want to enter(start at 0)");
                    pos = scanner.nextInt();
                    if(pos < 0){
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.println("Enter the value: ");
                    val = scanner.nextInt();
                    list.insertAtPos(pos,val);
                    break;
                case 4:System.out.println("Enter the position you want to delete(start at 0)");
                    pos = scanner.nextInt();
                    if(pos < 0){
                        System.out.println("Invalid position");
                        break;
                    }
                    list.deleteAtPos(pos);
                    break;
                case 5:System.out.println("length of Array: "+list.length());
                    break;
                case 6:list.deleteAtEnd();
                    break;
                case 7:System.out.println("Enter the value want to inser at first position");
                    val = scanner.nextInt();
                    list.insertAtBegning(val);;
                    break;
                case 8:System.out.println("Enter the index");
                    pos = scanner.nextInt();   
                    System.out.println("value in the index "+ pos+ " is " + list.getIndex(pos));
                    break;
                case 9:System.out.println("Enter the index");
                    pos = scanner.nextInt();
                    System.out.println("Enter the value want to update");
                    val = scanner.nextInt();
                    list.updateVal(pos, val);
                    break;
                case 10:System.out.println("Enter the value want to search");
                    val = scanner.nextInt();
                    System.out.println("Index of "+val+" is "+ list.searchVal(val));
                    break;
                case 11:System.out.println("Enter the value want to check");
                    val = scanner.nextInt();
                    System.out.println(val+ " is contains: "+list.contains(val));
                    break;
                case 12:list.clearList();
                    break;
                case 13:System.exit(0);
                    break;
                default:System.out.println("invalid choice");
                    break;
            }
        }
    }
}

class DynamicArray<T> implements Iterable<T>{
    private static final int initialCapcity = 4;
    private T arr[];
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    DynamicArray(){
        size =0;
        arr =(T[]) new Object [initialCapcity];
        capacity = initialCapcity;
    }
    public void add(T val){
        if(size == capacity){
            expandArray();
        }
        arr[size++] = val;

    }
    public void display(){
        System.out.println("Elements in the list");
        for(int i =0; i < size; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    private void expandArray(){
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }
    public void insertAtPos(int pos, T val){
        if(size == capacity){
            expandArray();
        }
        for (int i= size-1; i >= pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = val;
        size++;
    }
    public void deleteAtPos(int pos){
        for(int i=pos+1;i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
        if(capacity > 3*size && size > initialCapcity ){
            shrinkArray();
        }
    }
    private void shrinkArray(){
        capacity /= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }
    public int length(){
        return size;
    }
    public void deleteAtEnd(){
        arr[size-1] = 0;
        size--;
    }
    public void deleteAtBegining(){
        for (int i=0; i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }
    public void insertAtBegning(T val){
        if(size == capacity){
            expandArray();
        }
        int i;
        for (i=size; i>=0; i--){
            arr[i+1] = arr[i];
        }
        // System.out.println(i);
        arr[i+1] = val;
        size++;
    }
    public int getIndex(int pos){
        return arr[pos];
    }
    public void updateVal(int pos, T val){
        arr[pos] = val;
    }
    public int searchVal(T val){
        for (int i=0; i<size;i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }
    public void clearList(){
        size = 0;
    }
    public boolean contains(T val){
        boolean isContains = false;
        for (int i=0; i<size;i++){
            if(arr[i] == val){
                isContains = true;
            }
        }
        return isContains;
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int index = 0;
            public T next(){
                return arr[index++];
            }
            public boolean hasNext(){
                return index < size;
            }
        };
    }
    
}