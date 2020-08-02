package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] minimumArray = readIntegers(5);
        System.out.println(findMin(minimumArray));
    }

    private static int []readIntegers(int count)
    {
        System.out.println("Enter " + count + " integers");
        int[] userIntegers = new int [count];
        for (int i=0;i<userIntegers.length;i++)
        {
            userIntegers[i] = scanner.nextInt();
        }
        return userIntegers;
    }

    private static int findMin(int[] array)
    {
        Arrays.sort(array);
        return array[0];
    }
}
