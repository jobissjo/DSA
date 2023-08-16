public class BubbleSort {
    public static void sort(int arr[]){
        int n = arr.length;
        int temp;
        boolean swapped;
        for(int i=0; i<n-1; ++i){
            swapped = false;
            for(int j =1; j < n - i; ++j){
                if(arr[j-1] > arr[j] ){
                    swapped = true;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

            if(!swapped)
                break;
        }
    }
}
