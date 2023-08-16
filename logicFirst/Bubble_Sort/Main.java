import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int arr[] = {19,394,3,7,37,9,35,78,12,36};
        BubbleSort.sort(arr);

        System.out.println(Arrays.toString(arr));

        int newArr[] = {1,2,3,4,5,6,7,8};
        BubbleSort.sort(newArr);

        System.out.println(Arrays.toString(newArr));
    }
}