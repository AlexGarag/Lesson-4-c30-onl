package WorkingArrayElements;

public class SequencesIncreasingArrayElements {

    public static void outputIncreasingArrayElements(int[] inputArray) {
        boolean thereAreIncreasingSequencesArray = false;
        boolean thereIsNewIncreasingSequence = false;
        int referenceElementArray = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (referenceElementArray < inputArray[i]) {
                if (!thereAreIncreasingSequencesArray) {
                    thereAreIncreasingSequencesArray = true;
                    System.out.print("Sequences of increasing array elements: ");
                }
                if (thereIsNewIncreasingSequence) {
                    System.out.println();
                    System.out.print(referenceElementArray + "; ");
                    thereIsNewIncreasingSequence = false;
                }
                System.out.print(inputArray[i] + "; ");
            } else {
                thereIsNewIncreasingSequence = true;
            }
            referenceElementArray = inputArray[i];
        }
        if (!thereAreIncreasingSequencesArray) {
            System.out.print("No increasing sequences were found in the array");
        }
        System.out.println();
    }
}
