package fuad305;
public class HexConverter {

    /**
     * method to convert decimal numbers to hexadecimal numbers
     *
     * @param num
     * @return
     */
    public static String decToHex(int num) {
        int rem = 0;

        String str2 = "";
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            rem = num % 16;
            str2 = hex[rem] + str2;
            num = num / 16;
        }

        return str2;
    }
}
