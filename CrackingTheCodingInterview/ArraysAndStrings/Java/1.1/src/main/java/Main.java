/**
 * We assume that the character set is UTF
 * The implementation is handling all the code points from U+0000 to U+10FFFF, inclusive
 */
class Main {

    boolean allUnique(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        boolean[] codePoints = new boolean[0x110000];
        for (int offset = 0; offset < str.length(); ) {
            int codePoint = str.codePointAt(offset);
            if (codePoints[codePoint]) {
                return false;
            }
            codePoints[codePoint] = true;
            offset += Character.charCount(codePoint);
        }
        return true;
    }

    boolean allUniqueWithoutDS(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        for (int offset = 0; offset < str.length(); ) {
            int codePoint = str.codePointAt(offset);
            int charCount = Character.charCount(codePoint);
            for (int secondOffset = offset + charCount; secondOffset < str.length(); ) {
                int secondCodePoint = str.codePointAt(secondOffset);
                if (codePoint == secondCodePoint) {
                    return false;
                }
                secondOffset += Character.charCount(secondCodePoint);
            }
            offset += charCount;
        }
        return true;
    }
}