package WorkingArrayElements;

public class EvenOddNumbersSeparately {
    public static void outputEvenNumbers (int[] inputArray) {
        boolean thereAreEvenNumbersArray = false;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                if (!thereAreEvenNumbersArray) {
                    thereAreEvenNumbersArray = true;
                    System.out.print("Even numbers in the array: ");
                }
                System.out.print(inputArray[i] + "; ");
            }
        }
        if (!thereAreEvenNumbersArray) {
            System.out.println("No even numbers were found in the array");
        } else {
            System.out.println();
        }
    }
    public static void outputOddNumbers (int[] inputArray) {
        boolean thereAreOddNumbersArray = false;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0) {
                if (!thereAreOddNumbersArray) {
                    thereAreOddNumbersArray = true;
                    System.out.print("Odd numbers in the array: ");
                }
                System.out.print(inputArray[i] + "; ");
            }
        }
        if (!thereAreOddNumbersArray) {
            System.out.println("No odd numbers were found in the array");
        } else {
            System.out.println();
        }
    }
}
