package com.sparta.fw.display;

import com.sparta.fw.sorters.Sorter;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayManager {

    public static Logger loggerInDisplaydisplay = Logger.getLogger("Logger in Display");


    public static void printMenu(){ // menu choices
        System.out.println(
                "Please enter the following numbers to view the specific sort algorithm\n" +
                " 1 - Binary sort algorithm\n" +
                " 2 - Bubble sort algorithm\n" +
                " 3 - Insertion Sort algorithm\n");
                loggerInDisplaydisplay.setLevel(Level.ALL);
        System.out.println(loggerInDisplaydisplay.getLevel());
        loggerInDisplaydisplay.log(Level.INFO, "menu has been printed successful");

    }
    public static void sizeOfArray(){ // print out messages
        System.out.println("Select size of array: " );
        System.out.println();
        loggerInDisplaydisplay.setLevel(Level.ALL);
        System.out.println(loggerInDisplaydisplay.getLevel());
        loggerInDisplaydisplay.log(Level.INFO, "input needed for size of array");
    }

    public static void results (int[] toSort, Sorter sort){
        System.out.println("\nUnsorted: \n" + Arrays.toString(toSort));
        long startTime = System.nanoTime();
        int[] sortingArray = sort.sortingArray(toSort);
        System.out.println("\nSorted: \n" + Arrays.toString(sortingArray));
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println("Time ran: " +(endTime-startTime) + " nano seconds");
        System.out.println();

        loggerInDisplaydisplay.setLevel(Level.ALL);
        System.out.println(loggerInDisplaydisplay.getLevel());
        loggerInDisplaydisplay.log(Level.INFO, "results have been printed successful");
    }



}
