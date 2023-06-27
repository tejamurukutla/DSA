public class SearchInsertPosition {
    public static int searchInsertPosition(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return low; 
    }

    public static void main(String[] args) {
        int[] array = {-1,0,3,5,9,12};
        int target = 9;
        int index = searchInsertPosition(array, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
