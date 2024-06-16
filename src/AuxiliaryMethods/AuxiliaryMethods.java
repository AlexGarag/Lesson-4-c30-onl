package AuxiliaryMethods;

import static java.lang.Math.abs;

/**
 * This method returns the number of digits of the transmitted number.
 * If the number is zero, the method returns 0
 */
public class AuxiliaryMethods {
    public static int getQuantityDigitsNumber(int incomingNumber) {
        if (incomingNumber == 0) {
            return 0;
        }
        int remainderDivision;
        int digitsNumber = 1;

        do {
            remainderDivision = (int) (incomingNumber % (Math.pow(10, digitsNumber)));
            if (remainderDivision == incomingNumber) {
                return digitsNumber;
            }
            digitsNumber = digitsNumber + 1;
        } while (true);
    }

    public static boolean isNumberPalindrome (int incomingNumber) {
        if (abs(incomingNumber) < 10 ) {
            return false;
        }
        int quantityDigitsNumber = getQuantityDigitsNumber(incomingNumber);
        for (int i = 0; i < quantityDigitsNumber / 2; i++) {
            if ((incomingNumber / (int) Math.pow(10, i)) % 10 !=
                    (incomingNumber / (int) Math.pow(10, quantityDigitsNumber - i - 1)) % 10) {
                return false;
            }
        }
        return true;
    }
}
