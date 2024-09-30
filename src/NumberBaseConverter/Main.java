package NumberBaseConverter;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int inputBase = Menu.getBaseChoice("input");
            int outputBase = Menu.getOutputBaseChoice(inputBase);

            // 3. Enter the input value based on the chosen input base
            String inputValue = Inputter.getString(
                "Enter the input value in the chosen base:",
                "Invalid input! Please enter a valid value.");

            try {
                // Convert the input value to decimal first
                int decimalValue = BaseConverter.convertToDecimal(inputValue, inputBase);

                // Convert the decimal value to the desired output base
                String result = BaseConverter.convertFromDecimal(decimalValue, outputBase);

                // Display the result
                System.out.println("The equivalent value in the chosen output base is: " + result);
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input for the selected base system. Please try again.");
            }

            // Ask user if they want to continue or exit
            String continueChoice = Inputter.getString(
                "Do you want to perform another conversion? (Y/N):",
                "Invalid input! Please enter 'Y' or 'N'.", "^[YyNn]$");

            if (continueChoice.equalsIgnoreCase("N")) {
                System.out.println("Exiting the program. Thank you!");
                break;
            }
        }
    }
}
