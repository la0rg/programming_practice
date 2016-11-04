public class Main {

    public char[] replaceSpaces(char[] str, int len) {
        int newLength, numOfSpaces = 0;
        for (int i = 0; i < len; i++) {
            if (str[i] == ' ') {
                numOfSpaces++;
            }
        }
        newLength = len + numOfSpaces * 2 - 1;

        // shift every char to the right side of new length
        for (int i = len - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength--] = '0';
                str[newLength--] = '2';
                str[newLength--] = '%';
            } else {
                str[newLength--] = str[i];
            }
        }
        return str;
    }

}
