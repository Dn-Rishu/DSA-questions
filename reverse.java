import java.util.*;

public class reverse {
    public static void main(Strings[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int nums[] = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            nums[k++] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(nums[i]);
        }
    }
}