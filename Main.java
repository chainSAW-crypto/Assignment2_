import java.util.*;

public class Main {
    public static void main(String[] args) {
        NumberSorter sorter = new NumberSorter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'exit' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sorter.addNumber(number);
            } else if ("exit".equals(scanner.next())) {
                break;
            } else {
                System.out.println("Please enter a valid number or 'exit' to finish.");
            }
        }

        System.out.println("Even numbers: " + sorter.getEvenNumbers());
        System.out.println("Odd numbers: " + sorter.getOddNumbers());
    }
}