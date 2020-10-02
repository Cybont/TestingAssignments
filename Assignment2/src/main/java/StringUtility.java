public class StringUtility {
    public String Reverse(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            output.append(c);
        }
        return output.toString();
    }

    public String Capitalize(String input) {
        String output = input.toUpperCase();
        return output;
    }

    public String ToLower(String input) {
        String output = input.toLowerCase();
        return output;
    }
}
