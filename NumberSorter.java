import java.util.*;
class NumberSorter {
    private List<Integer> even = new ArrayList<>();
    private List<Integer> odd = new ArrayList<>();

    // Method to add a number to the correct list
    public void addNumber(int number) {
        if (number % 2 == 0) {
            even.add(number);
        } else {
            odd.add(number);
        }
    }

    // Method to get the even numbers list
    public List<Integer> getEvenNumbers() {
        return even;
    }

    // Method to get the odd numbers list
    public List<Integer> getOddNumbers() {
        return odd;
    }
}
