import java.util.Arrays;

public class Demo{
    public static void main(String[] args) {
        
        int arr[] = {1,6,3,7,22,89,45,87,34,65};

        System.out.println(LinearSearch.find(arr, 22));
        System.out.println(LinearSearch.find(arr, 21));
        System.out.println(LinearSearch.contains(arr, 45));
        System.out.println(LinearSearch.contains(arr, 143));

        String name = "Jobi Eren";
        System.out.println(LinearSearch.find(name, 'e'));
        System.out.println(LinearSearch.find(name, 'd'));
        System.out.println(LinearSearch.contains(name, 'd'));
        System.out.println(LinearSearch.contains(name, 'e'));
        

        int[][] twoDArray = {
            {10,30,23},
            {3,5,8},
            {2,9,7}
        };
        System.out.println(Arrays.toString(LinearSearch.find(twoDArray, 9)));
        System.out.println(Arrays.toString(LinearSearch.find(twoDArray, 234)));

        // Max element in Array
        int myArr[] = {4,6,84,12,79,125,2};
        
        System.out.println(LinearSearch.max(myArr));

        // Min Element in Array

        System.out.println(LinearSearch.min(myArr));


        // Count character
        System.out.println("Count Character");
        System.out.println(LinearSearch.countChar(name.toLowerCase(), 'e'));
        System.out.println(LinearSearch.countChar(name.toLowerCase(), 'p'));

        int myArr2[] = {
            12354,2352,547,8789,3424,64569,3436,4578,76,345
        };

        System.out.println(LinearSearch.countFourDigit(myArr2));
    }

    
}