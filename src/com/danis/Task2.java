package com.danis;

public class Task2 {
    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] arr = arrayFromStr(str) ;
        int sum = arraySum(arr);
        System.out.println(sum);
    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }

    private static int[] arrayFromStr(String str) {
        StringBuilder figuredString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                figuredString.append(str.charAt(i));
            }
        }
        int[] figuredArray = new int [figuredString.length()];
        for (int i = 0; i < figuredArray.length; i++) {
            figuredArray[i] = Character.getNumericValue(figuredString.charAt(i));
        }

        return figuredArray;
    }
}
