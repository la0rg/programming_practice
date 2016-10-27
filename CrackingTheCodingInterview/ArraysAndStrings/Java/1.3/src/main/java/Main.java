import java.util.Arrays;

/**
 * Assume that the comparison is case sensitive and whitespace
 * is significant. So, "god   " is different from "dog".
 *
 * Assumed character set is ASCII
 */
public class Main {

    boolean checkStringOrigin(final String origin, final String result) {
        if (origin != null && result != null && origin.length() != result.length()) {
            return false;
        }
        return Arrays.equals(countCharacters(origin), countCharacters(result));
    }

    private int[] countCharacters(final String str) {
        int[] result = new int[256];
        if (str != null) {
            for (int ch : str.toCharArray()) {
                result[ch]++;
            }
        }
        return result;
    }
}
