import static WorkingArrayElements.EvenOddNumbersSeparately.*;
import static WorkingArrayElements.MaxQuantityDigitsNumber.getMaxQuantityDigitsNumber;
import static WorkingArrayElements.MaxValueArray.getMaxValueArray;
import static WorkingArrayElements.MinQuantityDigitsNumber.getMinQuantityDigitsNumber;
import static WorkingArrayElements.MinValueArray.getMinValueArray;
import static WorkingArrayElements.NumberPalindrome.outputAllPalindromesArray;
import static WorkingArrayElements.SequencesIncreasingArrayElements.outputIncreasingArrayElements;

public class Main {
    public static void main(String[] args) {
        int[] workingArray  = new int[] {23, 18, 45, 89, 12321, 14, -12, -2, -1, 0, 1, 2, 3, -121};
        System.out.println("The minimum element of the array: " + getMinValueArray(workingArray));
        System.out.println("The maximum element of the array: " + getMaxValueArray(workingArray));
        outputEvenNumbers(workingArray);
        outputOddNumbers(workingArray);
        System.out.println("The longest element of the array: " + getMaxQuantityDigitsNumber(workingArray));
        System.out.println("The shortest element of the array: " + getMinQuantityDigitsNumber(workingArray));
        outputIncreasingArrayElements(workingArray);
        outputAllPalindromesArray(workingArray);
    }
}