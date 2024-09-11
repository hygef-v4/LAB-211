/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseNumberConverter;

/**
 *
 * @author Hung
 */
public class Helper {
     public static String convertBase(String input, int fromBase, int toBase) {
        // Parse the input as an integer in the source base
        int decimalValue = Integer.parseInt(input, fromBase);
        
        // Convert the decimal value to the target base
        return Integer.toString(decimalValue, toBase).toUpperCase();
    }
}
