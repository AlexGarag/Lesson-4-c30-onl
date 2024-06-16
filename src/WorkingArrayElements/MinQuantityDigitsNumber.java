package WorkingArrayElements;

import static AuxiliaryMethods.AuxiliaryMethods.*;

public class MinQuantityDigitsNumber {
    public static int getMinQuantityDigitsNumber(int[] inputArray) {
        int minQuantityDigitsNumber = getQuantityDigitsNumber(inputArray[0]);
        int arrayElementMinQuantityDigits = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (getQuantityDigitsNumber(inputArray[i]) < minQuantityDigitsNumber) {
                arrayElementMinQuantityDigits = inputArray[i];
            }
        }
        return arrayElementMinQuantityDigits;
    }
}