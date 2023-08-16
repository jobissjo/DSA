public class BinarySearch{
    public static int search(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAscending = false;

        if(arr[start] < arr[end])
            isAscending = true;
        while(start <= end){
            int mid = (start + end) / 2;
            if(isAscending){
                if(target > arr[mid])
                    start = mid + 1;
                else if(target < arr[mid])
                    end = mid - 1;
                else
                    return mid;
            }
            else{
                if(target > arr[mid])
                    end = mid - 1;
                else if(target < arr[mid])
                    start = start + 1;
                else
                    return mid;
            }
        }
        return -1;
    }
}