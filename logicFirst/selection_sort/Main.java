import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int arr[] = {19,394,3,7,37,9,35,78,12,36};

        SelectionSort.sort(arr);

        System.out.println(Arrays.toString(arr));

        SelectionSort.descendingSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}