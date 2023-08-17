import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int newArr[] = {10,24,75,2,42,3,9,8};
        Sort.insertionSort(newArr);

        System.out.println(Arrays.toString(newArr));
    }
}
