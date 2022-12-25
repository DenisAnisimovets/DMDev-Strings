package com.danis;

public class Task1 {
    public static void main(String[] args) {
        String str = "abc  Cpddd Dio OsfWw";
        String newStr = convertString(str);
        System.out.println(newStr);
    }

    private static String convertString(String str) {

        String strWithoutWhitespaces = str.replaceAll("\s", "");
        StringBuilder newString = new StringBuilder(strWithoutWhitespaces.toUpperCase());
        for (int i = 0; i < newString.length() - 1; i++) {
            if(newString.charAt(i) == newString.charAt(i + 1)) {
                newString.delete(i, i + 1);
                i--;
            }
        }
        return new String(newString);
    }
}
