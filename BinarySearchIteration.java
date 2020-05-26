
public class BinarySearchIteration {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}; // Input array

        System.out.println(binarySearchIterative(data, 24));
        System.out.println(binarySearchIterative(data, 99));

    }
    
    public static boolean binarySearchIterative(int[] arr, int x){
        int left = 0; // Left variable points at the left boundary
        int right = arr.length - 1; // Right variable points at the right boundary
        
        while (left <= right) { // While the pointers haven't crossed over
            int mid = (left + right) / 2; // Take mid point between both boundaries
            
            if (x == arr[mid]) { // If 'x' is equal to the value in the middle of the array return true
                return true;
            } else if (x < arr[mid]) { // If 'x' is less than the value in the middle of the array, set the right boundary to one value less than the mid value
                right = mid - 1;
            } else { // If 'x' is greater than the value in the middle of the array, set the left boundary to one value higher than the mid point
                left = mid + 1;
            }
        }
        return false; // If the value is not found return false
    }
}