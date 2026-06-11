package domain;

import java.util.Arrays;

/**
 * Клас для виконання обчислювальних операцій з масивами.
 */
public class Exercise
{
    /**
     * Метод шукає число, яке найчастіше зустрічається в масиві.
     * Спочатку масив сортується а потім знаходиться найдовший інтервал повторюваних чисел.
     * @param array вхідний одновимірний масив цілих чисел.
     * @return число, що повторюється найбільшу кількість разів
     */
    public static int Calculate(int[] array)
    {
        if (array == null || array.length == 0) return 0;

        Arrays.sort(array);

        int maxCount = 0;
        int mostFrequent = array[0];

        for (int i = 0; i < array.length; i++)
        {
            int currentCount = 1;
            
            while (i + 1 < array.length && array[i] == array[i + 1])
            {
                currentCount++;
                i++;
            }
            
            if (currentCount > maxCount)
            {
                maxCount = currentCount;
                mostFrequent = array[i];
            }
        }

        return mostFrequent;
    }
}