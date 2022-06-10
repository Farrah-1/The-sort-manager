package com.sparta.fw;

import com.sparta.fw.sorters.BinarySort;
import com.sparta.fw.sorters.BubbleSort;
import com.sparta.fw.sorters.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTester {

    int[] unsortedArray = {23, 31, 644, 25, 104, 24, 54};
    int[] sortedArray = {23, 24, 25, 31, 54, 104, 644};

    BinarySort Sorter = new BinarySort();

    @Test
    @DisplayName("Does it sort - Insertion Sort")
    void doesItSortInsertionSort() {

        InsertionSort.insertionSort(unsortedArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(unsortedArray));

    }

    @Test
    @DisplayName("Does it sort - Bubble Sort")
    void doesItSortBubbleSort() {

        BubbleSort.Bubble(unsortedArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(unsortedArray));

    }

    @Test
    @DisplayName("Does it sort - Binary Tree")
    void doesItSortBinaryTree() {

        int[] sorting = Sorter.sortingArray(unsortedArray);

        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(sorting));

    }

    @Test
    @DisplayName("Does it sort duplicates - Insertion Sort")
    void doesItSortDuplicatesInsertionSort() {

        int[] duplicateInput = {23, 45, 23, 45, 67, 23};
        int[] sortedDuplicate = {23, 23, 23, 45, 45, 67};

        InsertionSort.insertionSort(duplicateInput);
        Assertions.assertEquals(Arrays.toString(sortedDuplicate), Arrays.toString(duplicateInput));

    }

    @Test
    @DisplayName("Does it sort duplicates - Bubble Sort")
    void doesItSortDuplicatesBubbleSort() {

        int[] duplicateInput = {23, 45, 23, 45, 67, 23};
        int[] sortedDuplicate = {23, 23, 23, 45, 45, 67};

        BubbleSort.Bubble(duplicateInput);
        Assertions.assertEquals(Arrays.toString(sortedDuplicate), Arrays.toString(duplicateInput));

    }

    @Test
    @DisplayName("Does it sort duplicates - Binary Tree")
    void doesItSortDuplicatesBinaryTree() {

        int[] duplicateInput = {23, 45, 23, 45, 67, 23};
        int[] sortedDuplicate = {23, 23, 23, 45, 45, 67};

        int[] sorting = Sorter.sortingArray(duplicateInput);
        Assertions.assertEquals(Arrays.toString(sortedDuplicate), Arrays.toString(sorting));
    }

    @Test
    @DisplayName("Does it sort odd sized arrays- Insertion Sort")
    void doesItSortOddArraysInsertionSort() {

        int[] oddInput = {23, 45, 23, 45, 67, 23, 67};
        int[] sortedOdd = {23, 23, 23, 45, 45, 67, 67};

        InsertionSort.insertionSort(oddInput);
        Assertions.assertEquals(Arrays.toString(sortedOdd), Arrays.toString(oddInput));

    }

    @Test
    @DisplayName("Does it sort odd sized arrays- Bubble Sort")
    void doesItSortOddArraysBubbleSort() {

        int[] oddInput = {23, 45, 23, 45, 67, 23, 67};
        int[] sortedOdd = {23, 23, 23, 45, 45, 67, 67};

        BubbleSort.Bubble(oddInput);
        Assertions.assertEquals(Arrays.toString(sortedOdd), Arrays.toString(oddInput));

    }

    @Test
    @DisplayName("Does it sort odd sized arrays- Binary Sort")
    void doesItSortOddArraysBinarySort() {

        int[] oddInput = {23, 45, 23, 45, 67, 23, 67};
        int[] sortedOdd = {23, 23, 23, 45, 45, 67, 67};

        int[] sorting = Sorter.sortingArray(oddInput);
        Assertions.assertEquals(Arrays.toString(sortedOdd), Arrays.toString(sorting));

    }

    @Test
    @DisplayName("Already sorted- Insertion Sort")
    void doesItSortAlreadySortedArrayInsertionSort() {

        int[] alreadySorted = {23, 24, 25, 31, 54, 104, 644};


        InsertionSort.insertionSort(alreadySorted);
        Assertions.assertEquals(Arrays.toString(alreadySorted), Arrays.toString(alreadySorted));
    }
    @Test
    @DisplayName("Already sorted- Bubble Sort")
    void doesItSortAlreadySortedArrayBubbleSort() {

        int[] alreadySorted = {23, 24, 25, 31, 54, 104, 644};


        BubbleSort.Bubble(alreadySorted);
        Assertions.assertEquals(Arrays.toString(alreadySorted), Arrays.toString(alreadySorted));
    }
    @Test
    @DisplayName("Already sorted- Binary Sort")
    void doesItSortAlreadySortedArrayBinarySort() {

        int[] alreadySorted = {23, 24, 25, 31, 54, 104, 644};

        int[] sorting = Sorter.sortingArray(alreadySorted);
        Assertions.assertEquals(Arrays.toString(alreadySorted), Arrays.toString(sorting));
    }

    @Test
    @DisplayName("Large Numbers- Insertion Sort")
    void doesItSortLargeNumbersInsertionSort() {

        int[] unsortedLarge = {375823, 4363, 4634657, 3342, 105644, 5643, 54311};
        int[] sortedLarge = {3342, 4363, 5643, 54311, 105644, 375823, 4634657};


        InsertionSort.insertionSort(unsortedLarge);
        Assertions.assertEquals(Arrays.toString(sortedLarge), Arrays.toString(unsortedLarge));
    }
    @Test
    @DisplayName("Large Numbers- Bubble Sort")
    void doesItSortLargeNumbersBubbleSort() {

        int[] unsortedLarge = {375823, 4363, 4634657, 3342, 105644, 5643, 54311};
        int[] sortedLarge = {3342, 4363, 5643, 54311, 105644, 375823, 4634657};


        BubbleSort.Bubble(unsortedLarge);
        Assertions.assertEquals(Arrays.toString(sortedLarge), Arrays.toString(unsortedLarge));
    }





}
