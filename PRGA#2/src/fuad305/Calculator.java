package fuad305;
import java.util.Scanner;
public class Calculator {
    public static String RECOLOR = "\033[0;31m";
    public static String RESET = "\033[0m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean keepRunningLoop = true;
        while (keepRunningLoop) {
            System.out.println("Please Enter 1 for Binary Calculator");
            System.out.println("Please Enter 2 for Hexadecimal Calculator");
            System.out.println("Please Enter 3 for Bandwidth Calculator");
            System.out.println("Please Enter 4 to exit the program");
            System.out.println("Please Enter 5 test");
            int calcInput = scanner.nextInt();
            switch (calcInput) {
                case 1:
                    System.out.println("Please Enter 1 to Convert Binary numbers to Decimal Numbers");
                    System.out.println("Please Enter 2 to Convert Decimal numbers to Binary Numbers");
                    System.out.println("Please Enter 3 to perform Binary Computations");
                    System.out.println("4 to exits the program");
                    calcInput = scanner.nextInt();
                    String number;
                    switch (calcInput) {
                        case 1:
                            System.out.println("Please Enter Binary Number");
                            number = scanner.next();
                            System.out.println(DecimalConverter.binToDec(number));
                            break;
                        case 2:
                            System.out.println("Please Enter Decimal Number");
                            int decimalInput = scanner.nextInt();
                            System.out.println(BinaryConverter.decToBin(decimalInput));
                            break;
                        case 3:
                            System.out.println("Please enter first Binary number");
                            String num1 = scanner.next();
                            System.out.println("Please enter 2nd Binary number");
                            String num2 = scanner.next();
                            System.out.println("Please enter Operation + - * /");
                            char operation = scanner.next().charAt(0);
                            switch (operation) {
                                case '+':
                                    System.out.println(BinaryCalculator.addBinaryNumbers(num1, num2));
                                    break;
                                case '-':
                                    System.out.println(BinaryCalculator.subBinaryNumbers(num1, num2));
                                    break;
                                case '*':
                                    System.out.println(BinaryCalculator.mulBinaryNumbers(num1, num2));
                                    break;
                                case '/':
                                    System.out.println(BinaryCalculator.divBinaryNumbers(num1, num2));
                                    break;
                                default:
                                    System.out.println(RECOLOR + "Invalid input please try again" + RESET);
                                    break;
                            }

                            break;
                        case 4:
                            keepRunningLoop = false;
                        default:
                            System.out.println(RECOLOR + "Invalid input" + RESET);

                    }
                    break;

                case 2:
                    System.out.println("Please Enter 1 to Convert Hexadecimal numbers to Decimal Numbers");
                    System.out.println("Please Enter 2 to Convert Decimal numbers to Hexa Numbers");
                    System.out.println("Please Enter 3 to perform Hexadecimal Computations");
                    System.out.println("4 to exits the program");
                    calcInput = scanner.nextInt();
                    switch (calcInput) {
                        case 1:
                            System.out.println("Please Enter Hexadecimal Number");
                            number = scanner.next();
                            System.out.println(DecimalConverter.hexToDecimal(number));
                            break;
                        case 2:
                            System.out.println("Please Enter Decimal Number");
                            int decimalInput = scanner.nextInt();
                            System.out.println(HexConverter.decToHex(decimalInput));
                            break;
                        case 3:
                            System.out.println("Please enter first Hexadecimal number");
                            String num1 = scanner.next();
                            System.out.println("Please enter 2nd Hexadecimal number");
                            String num2 = scanner.next();
                            System.out.println("Please enter Operation + - * /");
                            char operation = scanner.next().charAt(0);
                            switch (operation) {
                                case '+':
                                    System.out.println(HexadecimalCalculator.addHexNumbers(num1, num2));
                                    break;
                                case '-':
                                    System.out.println(HexadecimalCalculator.subHexNumbers(num1, num2));
                                    break;
                                case '*':
                                    System.out.println(HexadecimalCalculator.mulHexNumbers(num1, num2));
                                    break;
                                case '/':
                                    System.out.println(HexadecimalCalculator.divHexNumbers(num1, num2));
                                    break;
                                default:
                                    System.out.println(RECOLOR + "Invalid input please try again" + RESET);
                                    break;
                            }
                            break;
                        case 4:
                            keepRunningLoop = false;
                        default:
                            System.out.println(RECOLOR + "Invalid input" + RESET);

                    }

                    break;
                case 3:

                    System.out.println("For Data Unit Converter Enter 1");
                    System.out.println("For Download/Upload Time Calculator Enter 2");
                    System.out.println("Website Bandwidth Calculator Enter 3");
                    System.out.println("For Hosting Bandwidth Converter Enter 4");
                    System.out.println("Terminate the program Enter 5");
                    int input = scanner.nextInt();
                    switch (input){
                        case 1:
                            System.out.println("Enter number of bits and bytes");
                            double data = scanner.nextDouble();
                            System.out.println("Enter unit like b, kb, mb, gb, tb, B, KB, MB, KB, GB, TB");
                            String unit = scanner.next();
                            BandwidthCalculator.dataUnitConverter(data, unit);
                            break;
                        case 2:
                            System.out.println("Enter the file size and its units Bytes KB MB GB TB");
                            long fileSize = scanner.nextLong();
                            String fileUnits = scanner.next();

                            System.out.println("Enter the Bandwidth and its units bits kb mb gb tb");
                            long bandwidth = scanner.nextLong();
                            String bandwidthUnits = scanner.next();
                            BandwidthCalculator.downloadUploadTimeCalculator(fileSize,fileUnits,bandwidth,bandwidthUnits);
                            break;

                        case 3:
                            System.out.println("Enter pages views  and Page view unit Per s, min, h, d, w, M, Y");
                            int pageView = scanner.nextInt();
                            String pageViewUnit=scanner.next();

                            System.out.println("Page size and page size unit B KB MB GB TB");
                            int pageSize = scanner.nextInt();
                            String pageSizeUnit=scanner.next();
                            System.out.println("Enter Redundancy factor");
                            int redundFact = scanner.nextInt();
                            BandwidthCalculator.websiteBandwidthCalculator(pageView,pageViewUnit,pageSize,pageSizeUnit,redundFact);
                        case 4:
                            System.out.println("Enter bandwidth in GB");
                            double bandwidthGB = scanner.nextDouble();
                            BandwidthCalculator.hostingBandwidthCalculator(bandwidthGB);


                    }


                    break;
                case 4:
                    keepRunningLoop = false;
                    break;
                case 5:
                    testCalculators();
                    break;
                default:
                    System.out.println(RECOLOR + "Invalid input" + RESET);

            }
        }
    }


    public static void testCalculators() {
        System.out.println("Testing Binary calculator");
        System.out.println("Converting 10 to decimal expected results 2");
        Integer integer = DecimalConverter.binToDec("10");
        if (integer == 2) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("Testing Binary calculator");
        System.out.println("Converting 2D to Binary expected results 10");
        String results = BinaryConverter.decToBin(2);
        if (results.equals("10")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }


        System.out.println("Testing Hexadecimal calculator");
        System.out.println("Converting 16 to decimal expected results 22");
        integer = DecimalConverter.hexToDecimal("16");
        if (integer == 22) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("Testing Hexadecimal calculator");
        System.out.println("Converting 22D to hexadecimal expected results 16");
        results = HexConverter.decToHex(22);
        if (results.equals("16")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }


    }

}
