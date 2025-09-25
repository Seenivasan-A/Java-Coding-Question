
import java.util.*;

public class MinMax {

    public static int[] findMaxMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must be non-empty");
        }

        int max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x > max) max = x;
            if (x < min) min = x;
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = findMaxMin(nums);
        System.out.println("Maximum = " + result[0]);
        System.out.println("Minimum = " + result[1]);

        sc.close();
    }
}
