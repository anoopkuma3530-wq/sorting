package Sorting;

public class romantoInteger {
    public static void main(String[] args) {

        char[] s = {'V', 'I','I', 'M'};

        int total = 0;
        int prevValue = 0;

        for (int i = s.length - 1; i >= 0; i--) {

            int currValue = getValue(s[i]);

            if (currValue < prevValue) {
                total += currValue;
            } else {
                total += currValue;
            }

            prevValue = currValue;
        }

        System.out.println(total);
    }

    static int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }
}
