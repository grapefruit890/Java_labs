package laba;

public class ProcessStrings implements Strings {

    public ProcessStrings(String line) {
        this.line = line;
    }
    private String line;
    public int charCount() {
        return this.line.length();
    }
    public String oddChars() {
        String res = "";

        for (int i = 0; i < line.length(); i+=2) {
            res += line.charAt(i);
        }
        return res;
    }
    public String reverseStr() {
        String res = "";

        for (int i = line.length() - 1; i >= 0; i--) {
            res += line.charAt(i);
        }

        return res;
    }
}
