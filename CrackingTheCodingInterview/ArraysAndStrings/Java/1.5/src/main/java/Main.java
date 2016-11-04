public class Main {

    public String compress(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            int lastCharPosition = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(lastCharPosition) != str.charAt(i)) {
                    sb.append(str.charAt(lastCharPosition));
                    sb.append(i - lastCharPosition);
                    lastCharPosition = i;
                }
            }
            sb.append(str.charAt(str.length() - 1));
            sb.append(str.length() - lastCharPosition);
        }
        if (str.length() > sb.length()) {
            return sb.toString();
        } else {
            return str;
        }
    }
}