import java.lang.Integer;

public class LinearSearch {

    public static int find(int arr[], int target) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static boolean contains(int arr[], int target) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }

    public static int find(String str, char target) {
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == target)
                return i;
        }
        return -1;
    }

    public static boolean contains(String str, char target) {
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == target)
                return true;
        }
        return false;
    }

    public static int[] find(int arr[][], int target) {
        int result[] = { -1, -1 };
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int max(int arr[]) {
        int maxEle = arr[0];
        for (int i = 1; i < arr.length; ++i)
            if (arr[i] > maxEle)
                maxEle = arr[i];
        return maxEle;
    }

    public static int min(int arr[]) {
        int minEle = arr[0];
        for (int i = 0; i < arr.length; ++i)
            if (arr[i] < minEle)
                minEle = arr[i];
        return minEle;
    }

    public static int countChar(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == target)
                ++count;
        }
        return count;
    }

    public static int countFourDigit(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // if (Integer.toString(arr[i]).length() == 4)
            if (arr[i] >= 1000 && arr[i] <= 9999)
                ++count;
        }
        return count;
    }

}