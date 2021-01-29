package fuad305;
public class BinaryConverter {

    /**
     * method to convert decimal number to binary
     *
     * @param decVal
     * @return
     */
    public static String decToBin(Integer decVal) {
        String answer = "";
        while (decVal > 0) {
            answer = decVal % 2 + answer;
            decVal /= 2;
        }
        return (answer.equals("")) ? "0" : answer;
    }
}
