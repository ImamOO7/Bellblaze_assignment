import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 0, 1, 2, 3, 5, 6};

        Arrays.sort(arr);  

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                System.out.println((arr[i] + 1));
                return;
            }
        }

        System.out.println("No missing number found");
    }
}