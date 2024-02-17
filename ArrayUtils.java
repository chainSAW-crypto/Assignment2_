public class ArrayUtils {

    /**
     * Finds two neighboring numbers in an array with the smallest distance between them.
     * @param numbers The array of integers to search through.
     * @return The index of the first number in the pair with the smallest distance. Returns -1 if the array is too small.
     */
    public static int findIndexOfSmallestDistance(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            // Array is too small to have any neighboring numbers
            return -1;
        }

        // Initialize with the first pair
        int minDistance = Math.abs(numbers[1] - numbers[0]);
        int minIndex = 0;

        // Loop through the array starting from the second element
        for (int i = 1; i < numbers.length - 1; i++) {
            int currentDistance = Math.abs(numbers[i + 1] - numbers[i]);

            // Update minDistance and minIndex if a smaller distance is found
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                minIndex = i;
            }
        }

        return minIndex;
    }

    // Example usage
    public static void main(String[] args) {
        int[] numbers = {5, 222, 34, 12}; // Example array
        int index = findIndexOfSmallestDistance(numbers);
        System.out.println("Index of the first number in the pair with the smallest distance: " + index);
    }
}