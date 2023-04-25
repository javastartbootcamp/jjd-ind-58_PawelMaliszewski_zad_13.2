import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> integerList = new ArrayList<>();
        try {
            boolean negativeNumber = false;
            while (!negativeNumber) {
                System.out.println("Wprowadź liczbę dodatnią, lub ujemna aby zakończyć");
                int number = scanner.nextInt();
                if (number >= 0) {
                    integerList.add(number);
                } else {
                    negativeNumber = true;
                }
            }
        } catch (Exception e) {
            System.err.println("Podano niewłaściwy format koniec programu");
        }
        if (integerList.size() > 0) {
            printNumbersInOpositeWay(integerList);
            printTheSumOfTheNumbers(integerList);
            printSmallestAndLargestNumber(integerList);
        }
        // napisz swój program tutaj. Do wczytywania danych użyj przekazanego w parametrze scannera
    }

    private void printSmallestAndLargestNumber(List<Integer> integerList) {
        int smallestNumber = Integer.MAX_VALUE;
        int largestNumber = Integer.MIN_VALUE;
        for (Integer integer : integerList) {
            if (integer > largestNumber) {
                largestNumber = integer;
            }
            if (integer < smallestNumber) {
                smallestNumber = integer;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + smallestNumber);
        System.out.println("Największa liczba w liście to " + largestNumber);
    }

    private void printTheSumOfTheNumbers(List<Integer> integerList) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
            sb.append(integer).append(" + ");
        }
        sb.replace(sb.length() - 2, sb.length(), "= ").append(sum);
        System.out.println(sb);
    }

    private void printNumbersInOpositeWay(List<Integer> integerList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = integerList.size() - 1; i >= 0; i--) {
            stringBuilder.append(integerList.get(i));
            stringBuilder.append(", ");
        }
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "");
        System.out.println(stringBuilder);
    }
}
