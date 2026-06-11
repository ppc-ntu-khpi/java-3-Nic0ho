package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
        { array[i] = (int) (Math.random() * 5) + 1; }

        System.out.println("Most frequent number in array " + Arrays.toString(array) + " is " + Exercise.Calculate(array));
    }
}