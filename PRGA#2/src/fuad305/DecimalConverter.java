package fuad305;
import java.util.InputMismatchException;

public class DecimalConverter {
    /**
     * method to convert hexadecimnal numbers to decimal numbers
     *
     * @param hexnum
     * @return
     */
    public static int hexToDecimal(String hexnum) {
        String hstring = "0123456789ABCDEF";
        hexnum = hexnum.toUpperCase();
        int num = 0;
        for (int i = 0; i < hexnum.length(); i++) {
            char ch = hexnum.charAt(i);
            int n = hstring.indexOf(ch);
            num = 16 * num + n;
        }
        return num;
    }


    /**
     * method to convert binary numbers to decimals numbers
     *
     * @param binVal
     * @return
     */
    public static Integer binToDec(String binVal) {
        for (int i = 0; i < binVal.length(); i++) {
            if (!(binVal.charAt(i) == '0' || binVal.charAt(i) == '1')) {
                throw new InputMismatchException("Incorrect Binary number");
            }
        }
        //10101  1   5-1-0=4
        int weight = 1, answer = 0;
        for (int i = 0; i < binVal.length(); i++) {
            answer += (binVal.charAt(binVal.length() - 1 - i) - '0') * weight;
            weight *= 2;
        }
        return answer;
    }
}
