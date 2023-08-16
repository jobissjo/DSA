import java.util.Arrays;

public class SelectionSort{

    public static void sort(int arr[]){
        int currentSmallNum;
        int selectedIndex = 0;
        for(int i=0; i< arr.length-1; i++){
            currentSmallNum = arr[i];
            for (int j=i+1; j<arr.length; j++){
                if(currentSmallNum > arr[j]){
                    currentSmallNum = arr[j];
                    selectedIndex = j;
                }
            }
            arr[selectedIndex] = arr[i];
            arr[i] = currentSmallNum;
        }
    }

    public static void descendingSort(int arr[]){
        int currentMaxElement;
        int selectedIndex = 0;
        for(int i=0; i<arr.length -1; ++i){
            currentMaxElement = arr[i];
            for(int j = i+1; j<arr.length; j++){
                if(currentMaxElement < arr[j]){
                    currentMaxElement = arr[j];
                    selectedIndex = j;
                }
            }
            arr[selectedIndex] = arr[i];
            arr[i] = currentMaxElement;
        }
        // System.out.println(Arrays.toString(arr));
    }
}