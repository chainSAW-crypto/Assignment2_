public class NeighboringNumbers {

    // Function to find two neighboring numbers with the smallest distance
    public static int findSmallestDistanceIndex(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int smallestDistance = Math.abs(array[1] - array[0]);
        int index = 0;

        for (int i = 1; i < array.length - 1; i++) {
            int currentDistance = Math.abs(array[i + 1] - array[i]);
            if (currentDistance < smallestDistance) {
                smallestDistance = currentDistance;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] numbers = {52, 312, 566, 3123};
        int index = findSmallestDistanceIndex(numbers);
        System.out.println("Index of the first number with the smallest distance to its neighbor: " + index);
    }
}