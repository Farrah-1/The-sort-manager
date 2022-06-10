package com.sparta.fw.starter;

import com.sparta.fw.display.DisplayManager;
import com.sparta.fw.exceptions.InvalidSorterException;
import com.sparta.fw.sorters.Sorter;

import java.util.Random;
import java.util.Scanner;

public class SortManager {

   public static int[] createArr(int arr) { //random numbers in array 0-100
      Random r = new Random();
      int[] unsortedArr = new int[arr];
      for (int i = 0; i < arr; i++) {
         unsortedArr[i] = r.nextInt(100) + 1;
      }
      return unsortedArr;

   }

   static Scanner scanner = new Scanner(System.in);

   public static void beginSystem() {

      System.out.println("Enter any number apart from 0 to continue to menu ");
      int start = scanner.nextInt();

      while (start != 0) {
         try {

            DisplayManager.printMenu();// display options
            int menuChoice = scanner.nextInt();//store the value in input object

            Sorter sort = SortFactory.getSorter(menuChoice); //input choice into the switch statement in factory method

            DisplayManager.sizeOfArray();
            int sizeChoice = scanner.nextInt();


            int [] arrayToSort = SortManager.createArr(sizeChoice); // random numbers to sort
            DisplayManager.results(arrayToSort, sort);

//         results();
         } catch (InvalidSorterException e) {
            throw new RuntimeException(e);
         }
         System.out.println("Enter any number apart from 0 to continue to continue to menu - Enter 0 to Exit the program ");
         start = scanner.nextInt();
      }


   }
}