package WorkingArrayElements;

import static AuxiliaryMethods.AuxiliaryMethods.*;

public class MaxQuantityDigitsNumber {
    public static int getMaxQuantityDigitsNumber(int[] inputArray) {
        int maxQuantityDigitsNumber = getQuantityDigitsNumber(inputArray[0]);
        int arrayElementMaximumQuantityDigits = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
//            int j = getQuantityDigitsNumber(inputArray[i]);
            if (getQuantityDigitsNumber(inputArray[i]) > maxQuantityDigitsNumber) {
                arrayElementMaximumQuantityDigits = inputArray[i];
                maxQuantityDigitsNumber = getQuantityDigitsNumber(inputArray[i]);
            }
        }
        return arrayElementMaximumQuantityDigits;
    }
}
