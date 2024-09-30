package NumberBaseConverter;

public class BaseConverter {

    // Method to convert input value from any base to decimal
    public static int convertToDecimal(String value, int base) {
        switch (base) {
            case 1: // Binary (Base 2)
                return Integer.parseInt(value, 2); 
            case 2: // Decimal (Base 10)
                return Integer.parseInt(value);
            case 3: // Hexadecimal (Base 16)
                return Integer.parseInt(value, 16);
            default:
                throw new NumberFormatException("Unsupported base.");
        }
    }

    // Method to convert decimal value to any base
    public static String convertFromDecimal(int value, int base) {
        switch (base) {
            case 1: // Binary (Base 2)
                return Integer.toBinaryString(value);
            case 2: // Decimal (Base 10)
                return Integer.toString(value);
            case 3: // Hexadecimal (Base 16)
                return Integer.toHexString(value).toUpperCase();
            default:
                throw new NumberFormatException("Unsupported base.");
        }
    }
}
