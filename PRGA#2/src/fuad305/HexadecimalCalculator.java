package fuad305;
public class HexadecimalCalculator {

    /**
     * method to add Hexadecimal numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String addHexNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.hexToDecimal(num1);
        int decNum2 = DecimalConverter.hexToDecimal(num2);
        int sum = decNum1 + decNum2;
        return HexConverter.decToHex(sum);
    }

    /**
     * method to subtract Hexadecimal numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String subHexNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.hexToDecimal(num1);
        int decNum2 = DecimalConverter.hexToDecimal(num2);
        int sum = decNum1 - decNum2;
        return HexConverter.decToHex(sum);
    }

    /**
     * method to Multiply Hexadecimal numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String mulHexNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.hexToDecimal(num1);
        int decNum2 = DecimalConverter.hexToDecimal(num2);
        int sum = decNum1 * decNum2;
        return HexConverter.decToHex(sum);
    }

    /**
     * method to Divide Hexadecimal numbers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String divHexNumbers(String num1, String num2) {
        int decNum1 = DecimalConverter.hexToDecimal(num1);
        int decNum2 = DecimalConverter.hexToDecimal(num2);
        int sum = decNum1 / decNum2;
        return HexConverter.decToHex(sum);
    }

}
