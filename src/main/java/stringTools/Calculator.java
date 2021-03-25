package stringTools;

/**
 * A class for performing mathematical operations with strings.
 *
 * @author anywaythanks
 * @version 0.0
 */
public class Calculator {
    /**
     * @param s      string to be counted.
     * @param symbol sought symbol.
     * @return the number of sought characters in the string.
     */
    public static int calculateQuantitySymbol(String s, String symbol) {
        return s.length() - s.replace(symbol, "").length();
    }
}
