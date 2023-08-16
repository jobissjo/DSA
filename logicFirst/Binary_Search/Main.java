public class Main{
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,8,9,10,13,15,18,20};

        System.out.println(BinarySearch.search(arr, 20));
        System.out.println(BinarySearch.search(arr, 13));

        int arr1[] = {20,18,17,15,14,12,10,9,6,3,1};

        System.out.println(BinarySearch.search(arr1, 15));
        System.out.println(BinarySearch.search(arr1, 11));
    }
}
