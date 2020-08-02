package com.company;

import java.util.Scanner;

public class ReverseArrayChallenge {

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int[] values = getIntegers(5);
        reverseIntegers(values);
    }

    //return user input and store to an array
    private static int[] getIntegers(int number) {
        System.out.println("Enter in your desired integers");
        int[] integers = new int[number];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = s.nextInt();
        }
        return integers;
    }

    //method to reverse an array
    private static int[] reverseIntegers(int[] array)
    {
        int[]values = array;
        for(int i =0;i<values.length;i++)
        {
            System.out.println(values[(values.length-1)-i]);
        }
        return values;
    }

    //how to convert an int to a string --not challenge relevant but good to know
    public static String convertIntToString(int n)
    {
        String s = Integer.toString(n);
        return s;
    }
}
