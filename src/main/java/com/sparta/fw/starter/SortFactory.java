package com.sparta.fw.starter;

import com.sparta.fw.exceptions.InvalidSorterException;
import com.sparta.fw.sorters.BinarySort;
import com.sparta.fw.sorters.BubbleSort;
import com.sparta.fw.sorters.InsertionSort;
import com.sparta.fw.sorters.Sorter;

public class SortFactory {

    public static Sorter getSorter(int caseChoice) throws InvalidSorterException {

        switch (caseChoice) { //could do as lambda version
            case 1:
                return new BinarySort();
            case 2:
                return new BubbleSort();
            case 3:
                return new InsertionSort();
            default:
                throw new InvalidSorterException("Invalid selection: " + caseChoice);
        }


    }
}
