import java.util.Scanner;

public class DynamicArrayDemo{
    public static void main(String[] args) {
        int val, pos ;
        DynamicArray list = new DynamicArray();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n ----- List Menu --------\n");
            System.out.println("1.Insert at the end\n");
            System.out.println("2.Display the list\n");
            System.out.println("3.Insert at specified position\n");
            System.out.println("4.Delete from specified position\n");
            System.out.println("5.Exit");
            System.out.println("\n------------------------------\n");
            System.out.println("Enter your choice:\t");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:System.out.println("Enter the value: ");
                    val = scanner.nextInt();
                    list.add(val);
                    break;
                case 2:list.display();
                    break;
                case 3: System.out.println("Enter the position you want to enter(start at 0)");
                    pos = scanner.nextInt();
                    if(pos < 0){
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.println("Enter the value: ");
                    val = scanner.nextInt();
                    // list.insertAtPos(pos,val);
                    break;
                case 4:System.out.println("Enter the position you want to delete(start at 0)");
                    pos = scanner.nextInt();
                    if(pos < 0){
                        System.out.println("Invalid position");
                        break;
                    }
                    // list.deletAtPos(pos);
                    break;
                case 5:System.exit(0);
            
                default:System.out.println("invalid choice");

                    break;
            }
        }
    }
}

class DynamicArray {
    private static final int initialCapcity = 16;
    private int arr[];
    private int size;
    private int capacity;
    DynamicArray(){
        size =0;
        arr = new int[initialCapcity];
        capacity = initialCapcity;
    }
    public void add(int val){
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
    }
    private void expandArray(){
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);

    }

    
}