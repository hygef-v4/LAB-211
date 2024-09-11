package BaseNumberConverter;

/**
 *
 * @author Hung
 */
public class Input {

    // Validate binary input
    public static boolean isValidBinary(String input) {
        return input.matches("[01]+");
    }

    // Validate decimal input
    public static boolean isValidDecimal(String input) {
        return input.matches("\\d+");
    }

    // Validate hexadecimal input
    public static boolean isValidHexadecimal(String input) {
        return input.matches("[0-9A-Fa-f]+");
    }
}
