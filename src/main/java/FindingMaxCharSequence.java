public class FindingMaxCharSequence {
    public String maxCharSequence(String kbInput) {
        int currentOne = 0;
        int currentZero = 0;
        int maxZero = 0;
        int maxOne = 0;
        for (char key : kbInput.toCharArray()) {
            if (key == '0') {
                currentOne = 0;
                currentZero++;
                maxZero = Math.max(currentZero, maxZero);
            } else if (key == '1') {
                currentZero = 0;
                currentOne++;
                maxOne = Math.max(currentOne, maxOne);
            }
        }
        return "maxOne " + maxOne + " & " + "maxZero " + maxZero;

    }
}

