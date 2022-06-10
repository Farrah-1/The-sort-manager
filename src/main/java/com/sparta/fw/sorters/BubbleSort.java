package com.sparta.fw.sorters;

public class BubbleSort implements Sorter {


    @Override
    public int[] sortingArray(int[] toSort) {
        Bubble(toSort);
        return toSort;
    }

    public static int[] Bubble(int[] sortNumbers) {

        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < sortNumbers.length; i++) {
                if (sortNumbers[i - 1] > sortNumbers[i]) { // if the value in the index 0 is more than the one current one... then swap
                    swapped = true;
                    int swap = sortNumbers[i - 1]; //store the swapped number in swap placeholder
                    sortNumbers[i - 1] = sortNumbers[i];  // placeholder value now equals the current figure - moving to the right
                    sortNumbers[i] = swap; // index 1 is swapped figure

                }
            }
        } while (swapped);


        return sortNumbers;
    }
}







