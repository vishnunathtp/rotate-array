import java.util.Arrays;

public class RotateArrayTest {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
        RotateArray.rotate(a1, 3);
        assert Arrays.equals(a1, new int[]{5, 6, 7, 1, 2, 3, 4}) : "Test 1 Failed";

        int[] a2 = {-1, -100, 3, 99};
        RotateArray.rotate(a2, 2);
        assert Arrays.equals(a2, new int[]{3, 99, -1, -100}) : "Test 2 Failed";

        System.out.println("All RotateArray tests passed!");
    }
}
