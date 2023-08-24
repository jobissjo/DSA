import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int newArr[] = {10,24,75,2,42,3,9,8};
        Sort.insertionSort(newArr);

        System.out.println(Arrays.toString(newArr));
        int newArr1[] = {78,89,12,23,45,56,58,75};
        int result[] = MergeSort.sort(newArr1);
        System.out.println(Arrays.toString(result));

        int mergeInArr[] = {78,51,32,95,13,79,34,38,45,67,91};
        MergeSort.mergeSortInPlace(mergeInArr, 0, mergeInArr.length);
        System.out.println(Arrays.toString(mergeInArr));

        // Quick Sort

        int[] quickArr = {10,30,23,25,78,49,35,67};
        QuickSort.sort(quickArr, 0, quickArr.length-1);
        System.out.println(Arrays.toString(quickArr));

        // 
    }
}
