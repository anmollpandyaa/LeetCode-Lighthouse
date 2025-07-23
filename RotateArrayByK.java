public class RotateArrayByK {
    public static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseSubArray(nums, 0, nums.length - 1);
        reverseSubArray(nums, 0, k - 1);
        reverseSubArray(nums, k, nums.length - 1);

    }
}