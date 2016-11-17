public class Main {

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }
        if (s1 == s2) {
            return true;
        }
        String s1s1 = s1 + s1;
        return s1s1.contains(s2);
    }
}
