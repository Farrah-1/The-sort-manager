package com.sparta.fw;

import com.sparta.fw.sorters.BubbleSort;
import com.sparta.fw.sorters.InsertionSort;
import com.sparta.fw.sorters.binarytree.BinaryTree;
import com.sparta.fw.starter.SortManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PerformanceTester {
    int[] testArray50 = SortManager.createArr(50);
    int[] testArray200 = SortManager.createArr(200);
    int[] testArray10000 = SortManager.createArr(10000);
    @Nested
    @DisplayName("Tests with 50 elements")
    class TestsWith50Elements {
        @Test
        @DisplayName("Binary Sorter - Performance with 50 elements")
        void testBinarySorter50() {

            long startTime = System.nanoTime();

            System.out.println("Binary Tree Sort - This test is carry out array of 50 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray50));
            BinaryTree tree = new BinaryTree(testArray50);
            tree.addElements(testArray50);
            int[] binary50 = tree.getSortedTreeAsc();
            long endTime = System.nanoTime();
            long time = endTime - startTime;


            System.out.println("Sorted: \n" + Arrays.toString(binary50));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();

        }

        @Test
        @DisplayName("Bubble Sorter - Performance with 50 elements")
        public void testBubbleSorter50() {

            long startTime = System.nanoTime();


            System.out.println("Bubble Sort -  This test is carry out array of 50 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray50));

            int[] sorted = BubbleSort.Bubble(testArray50);
            long endTime = System.nanoTime();
            long time = endTime - startTime;


            System.out.println("Sorted: \n" + Arrays.toString(sorted));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();

        }

        @Test
        @DisplayName("Insertion Sorter - Performance with 50 elements")
        void testInsertionSorter50() {

            long startTime = System.nanoTime();

            System.out.println("Insertion Sort - This test is carry out array of 50 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray50));
            int[] sorted = InsertionSort.insertionSort(testArray50);
            long endTime = System.nanoTime();
            long time = endTime - startTime;

            System.out.println("Sorted: \n" + Arrays.toString(sorted));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();
        }

    }

    @Nested
    @DisplayName("Tests with 200 elements")
    class TestsWith200Elements {

        @Test
        @DisplayName("Binary Sorter - Performance with 200 elements")
        void testBinarySorter200() {

            long startTime = System.nanoTime();

            System.out.println("Binary Tree Sort - This test is carry out array of 200 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray200));
            BinaryTree tree = new BinaryTree(testArray200);
            tree.addElements(testArray200);
            int[] binary200 = tree.getSortedTreeAsc();
            long endTime = System.nanoTime();
            long time = endTime - startTime;


            System.out.println("Sorted: \n" + Arrays.toString(binary200));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();

        }

        @Test
        @DisplayName("Bubble Sorter - Performance with 200 elements")
        public void testBubbleSorter() {
            long startTime = System.nanoTime();

            System.out.println("Bubble Sort -  This test is carry out array of 200 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray200));

            int[] sorted = BubbleSort.Bubble(testArray200);
            long endTime = System.nanoTime();
            long time = endTime - startTime;


            System.out.println("Sorted: \n" + Arrays.toString(sorted));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();

        }

        @Test
        @DisplayName("Insertion Sorter - Performance with 200 elements")
        void testInsertionSorter() {
            long startTime = System.nanoTime();

            System.out.println("Insertion Sort - This test is carry out array of 200 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray200));
            int[] sorted = InsertionSort.insertionSort(testArray200);
            long endTime = System.nanoTime();
            long time = endTime - startTime;

            System.out.println("Sorted: \n" + Arrays.toString(sorted));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();
        }
    }

    @Nested
    @DisplayName("Tests with 10,000 elements")
    class TestsWith10000Elements {
        @Test
        @DisplayName("Binary Sorter - Performance with 10000 elements")
        void testBinarySorter10000() {


            long startTime = System.nanoTime();

            System.out.println("Binary Tree Sort - This test is carry out array of 10000 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray10000));
            BinaryTree tree = new BinaryTree(testArray10000);
            tree.addElements(testArray10000);
            int[] binary10000 = tree.getSortedTreeAsc();
            long endTime = System.nanoTime();
            long time = endTime - startTime;


            System.out.println("Sorted: \n" + Arrays.toString(binary10000));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();

        }

        @Test
        @DisplayName("Bubble Sorter - Performance with 10000 elements")
        public void testBubbleSorter10000() {
            long startTime = System.nanoTime();

            System.out.println("Bubble Sort -  This test is carry out array of 10000 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray10000));

            int[] sorted = BubbleSort.Bubble(testArray10000);
            long endTime = System.nanoTime();
            long time = endTime - startTime;


            System.out.println("Sorted: \n" + Arrays.toString(sorted));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();

        }

        @Test
        @DisplayName("Insertion Sorter - Performance with 10000 elements")
        void testInsertionSorter10000() {
            long startTime = System.nanoTime();

            System.out.println("Insertion Sort - This test is carry out array of 10000 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(testArray10000));
            int[] sorted = InsertionSort.insertionSort(testArray10000);
            long endTime = System.nanoTime();
            long time = endTime - startTime;

            System.out.println("Sorted: \n" + Arrays.toString(sorted));
            System.out.println("Time take: " + time + " nano seconds");
            System.out.println();
        }
    }


}