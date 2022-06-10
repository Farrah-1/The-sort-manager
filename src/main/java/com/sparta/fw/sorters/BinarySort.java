package com.sparta.fw.sorters;

import com.sparta.fw.sorters.binarytree.BinaryTree;

public class BinarySort implements Sorter{

    @Override
    public int[] sortingArray(int[] toSort) {
        BinaryTree branch = new BinaryTree(toSort);
        int[] sortedArray = branch.getSortedTreeAsc();

        return sortedArray;
    }


}
