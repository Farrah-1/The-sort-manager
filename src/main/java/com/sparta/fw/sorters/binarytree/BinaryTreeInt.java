package com.sparta.fw.sorters.binarytree;

import com.sparta.fw.exceptions.ChildNotFoundException;

public interface BinaryTreeInt {
    int getRootElement();  //show root number

    int getNumberOfElements(); //show root number

    void addElement(int element);

    void addElements(final int[] elements); //array of numbers that been entered

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
