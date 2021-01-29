package fuad305;
public class BinaryCalculator {
    /**
     * method to add two binary numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String addBinaryNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.binToDec(num1);
        int decNum2 = DecimalConverter.binToDec(num2);
        int sum = decNum1 + decNum2;
        return BinaryConverter.decToBin(sum);
    }

    /**
     * method to subtract Binary numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String subBinaryNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.binToDec(num1);
        int decNum2 = DecimalConverter.binToDec(num2);
        int sum = decNum1 - decNum2;
        return BinaryConverter.decToBin(sum);
    }

    /**
     * method to Multiply Binary numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String mulBinaryNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.binToDec(num1);
        int decNum2 = DecimalConverter.binToDec(num2);
        int sum = decNum1 * decNum2;
        return BinaryConverter.decToBin(sum);
    }

    /**
     * method to Divide Binary numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String divBinaryNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.binToDec(num1);
        int decNum2 = DecimalConverter.binToDec(num2);
        int sum = decNum1 / decNum2;
        return BinaryConverter.decToBin(sum);

    }

}
