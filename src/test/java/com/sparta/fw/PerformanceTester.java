package com.sparta.fw;

import com.sparta.fw.sorters.BubbleSort;
import com.sparta.fw.sorters.InsertionSort;
import com.sparta.fw.sorters.Sorter;
import com.sparta.fw.sorters.binarytree.BinaryTree;
import com.sparta.fw.starter.SortManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PerformanceTester {

int [] array50ele = SortManager.createArr(50);// small number of elements
int[] unsArray50ele = array50ele;

int [] array200ele = SortManager.createArr(200);
int[] unsArray200ele = array200ele;

int [] array10000ele = SortManager.createArr(10000);// larger number of elements
int[] unsArray10000ele = array10000ele;

        @Test
        @DisplayName("Binary Sorter - Performance with 50 elements")
        void testBinarySorter50(){
            BinaryTree tree = new BinaryTree(unsArray50ele);
            tree.addElements(array50ele);
            long startTime = System.nanoTime();
            int[] binary50 = tree.getSortedTreeAsc();
            long endTime = System.nanoTime();
            long time = endTime-startTime;

            System.out.println("Binary Tree Sort - This test is carry out array of 50 elements for ");
            System.out.println("Unsorted: \n" + Arrays.toString(unsArray50ele));
            System.out.println("Sorted: \n" +Arrays.toString(binary50) );
            System.out.println("Time take: " +time + " nano seconds");
            System.out.println();

        }

         @Test
         @DisplayName("Bubble Sorter - Performance with 50 elements")
         public void testBubbleSorter50(){
             Sorter sort = new BubbleSort();

             long startTime = System.nanoTime();
             BubbleSort.Bubble(unsArray50ele);
             long endTime = System.nanoTime();
             long time = endTime-startTime;


             System.out.println("Bubble Sort -  This test is carry out array of 50 elements for ");
             System.out.println("Unsorted: \n" + Arrays.toString(array50ele));
             System.out.println("Sorted: \n" +Arrays.toString(unsArray50ele) );
             System.out.println("Time take: " +time + " nano seconds");
             System.out.println();

         }

         @Test
         @DisplayName("Insertion Sorter - Performance with 50 elements")
         void testInsertionSorter50(){
             long startTime = System.nanoTime();
             InsertionSort.insertionSort(unsArray50ele);
             long endTime = System.nanoTime();
             long time = endTime-startTime;

             System.out.println("Insertion Sort - This test is carry out array of 50 elements for ");
             System.out.println("Unsorted: \n" + Arrays.toString(array50ele));
             System.out.println("Sorted: \n" +Arrays.toString(unsArray50ele) );
             System.out.println("Time take: " +time + " nano seconds");
             System.out.println();
    }

    @Test
    @DisplayName("Binary Sorter - Performance with 200 elements")
    void testBinarySorter200(){
        BinaryTree tree = new BinaryTree(unsArray200ele);
        tree.addElements(array200ele);
        long startTime = System.nanoTime();
        int[] binary200 = tree.getSortedTreeAsc();
        long endTime = System.nanoTime();
        long time = endTime-startTime;

        System.out.println("Binary Tree Sort - This test is carry out array of 50 elements for ");
        System.out.println("Unsorted: \n" + Arrays.toString(unsArray200ele));
        System.out.println("Sorted: \n" +Arrays.toString (binary200));
        System.out.println("Time take: " +time + " nano seconds");
        System.out.println();

    }

    @Test
    @DisplayName("Bubble Sorter - Performance with 200 elements")
    public void testBubbleSorter(){
        Sorter sort = new BubbleSort();

        long startTime = System.nanoTime();
        BubbleSort.Bubble(array200ele);
        long endTime = System.nanoTime();
        long time = endTime-startTime;


        System.out.println("Bubble Sort -  This test is carry out array of 50 elements for ");
        System.out.println("Unsorted: \n" + Arrays.toString(unsArray200ele));
        System.out.println("Sorted: \n" +Arrays.toString(array50ele) );
        System.out.println("Time take: " +time + " nano seconds");
        System.out.println();

    }

    @Test
    @DisplayName("Insertion Sorter - Performance with 200 elements")
    void testInsertionSorter(){
        long startTime = System.nanoTime();
        InsertionSort.insertionSort(array200ele);
        long endTime = System.nanoTime();
        long time = endTime-startTime;

        System.out.println("Insertion Sort - This test is carry out array of 50 elements for ");
        System.out.println("Unsorted: \n" + Arrays.toString(unsArray200ele));
        System.out.println("Sorted: \n" +Arrays.toString(array200ele) );
        System.out.println("Time take: " +time + " nano seconds");
        System.out.println();
    }
    @Test
    @DisplayName("Binary Sorter - Performance with 10000 elements")
    void testBinarySorter10000(){
        BinaryTree tree = new BinaryTree(unsArray10000ele);
        tree.addElements(array10000ele);
        long startTime = System.nanoTime();
        int[] binary10000 = tree.getSortedTreeAsc();
        long endTime = System.nanoTime();
        long time = endTime-startTime;

        System.out.println("Binary Tree Sort - This test is carry out array of 10000 elements for ");
        System.out.println("Unsorted: \n" + Arrays.toString(unsArray10000ele));
        System.out.println("Sorted: \n" +Arrays.toString (binary10000));
        System.out.println("Time take: " +time + " nano seconds");
        System.out.println();

    }

    @Test
    @DisplayName("Bubble Sorter - Performance with 10000 elements")
    public void testBubbleSorter10000(){
        Sorter sort = new BubbleSort();

        long startTime = System.nanoTime();
        BubbleSort.Bubble(array10000ele);
        long endTime = System.nanoTime();
        long time = endTime-startTime;


        System.out.println("Bubble Sort -  This test is carry out array of 10000 elements for ");
        System.out.println("Unsorted: \n" + Arrays.toString(unsArray10000ele));
        System.out.println("Sorted: \n" +Arrays.toString(array10000ele) );
        System.out.println("Time take: " +time + " nano seconds");
        System.out.println();

    }

    @Test
    @DisplayName("Insertion Sorter - Performance with 10000 elements")
    void testInsertionSorter10000(){
        long startTime = System.nanoTime();
        InsertionSort.insertionSort(array200ele);
        long endTime = System.nanoTime();
        long time = endTime-startTime;

        System.out.println("Insertion Sort - This test is carry out array of 10000 elements for ");
        System.out.println("Unsorted: \n" + Arrays.toString(unsArray10000ele));
        System.out.println("Sorted: \n" +Arrays.toString(array10000ele) );
        System.out.println("Time take: " +time + " nano seconds");
        System.out.println();
    }


}