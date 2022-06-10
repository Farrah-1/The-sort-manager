package com.sparta.fw.sorters;

public class InsertionSort implements Sorter {

    @Override
    public int[] sortingArray(int[] toSort) {
        insertionSort(toSort);
        return toSort;
    }
    public static int[] insertionSort(int[] arrayNumbers) {
        for (int i = 1; i < arrayNumbers.length; i++) {
            int element = arrayNumbers[i];
            int j = i - 1;

            while (j >= 0 && arrayNumbers[j] > element) {
                arrayNumbers[j + 1] = arrayNumbers[j];
                j = j - 1;
            }
            arrayNumbers[j + 1] = element;
        }

        return arrayNumbers;
    }

}

