class romanToInt {
    public int ReverseInteger(String s) {
        int sum = 0;
        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            if (i > 0 && getValue(sArray[i]) > getValue(sArray[i - 1])) {
                // Subtraction case
                sum += getValue(sArray[i]) - 2 * getValue(sArray[i - 1]);
            } else {
                sum += getValue(sArray[i]);
            }
        }
        return sum;
    }

    private int getValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1; // Invalid character
        }
    }
}
