import java.util.Scanner;

public class Lab4Task13 {
    public static int hexCharToDecimal(char hexChar) {
        if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + (hexChar - 'A');
        } else if (hexChar >= 'a' && hexChar <= 'f') {
            return 10 + (hexChar - 'a');
        }
        else {
            return hexChar - '0';
        }
    }
    public static int hexStringToDecimal(String hexString) {
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            int digitValue = hexCharToDecimal(hexString.charAt(i));
            decimalValue = decimalValue * 16 + digitValue;
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your hexNumber: ");
        String hexNumber = input.nextLine();
        //"AB8C"

        int decimalNumber = hexStringToDecimal(hexNumber);
        System.out.println("The decimal equivalent of hex number " + hexNumber + " is " + decimalNumber);
    }
}