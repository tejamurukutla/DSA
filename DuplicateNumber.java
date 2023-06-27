import java.util.Arrays;
public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,3,4,2,1};
        int duplicate = findDuplicate(array);
        if (duplicate != -1) {
            System.out.println("Duplicate number: " + duplicate);
        } else {
            System.out.println("No duplicate found");
        }
    }
}
