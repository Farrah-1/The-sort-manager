package com.sparta.fw.sorters.binarytree;

public class Node {  //class
    private final int value; // private final so value is not changeable
    private Node leftChild;
    private Node rightChild;


    public Node(int value) { // what will each node include? = VALUE
        this.value = value; // this. - (current object in constructor -so we will be able to return value (initilising it ))

    }

    public int getValue() {
        return value;
    }

    public void setLeftChild(Node leftChild) { // to set value
        this.leftChild = leftChild;
    }

    public Node getLeftChild() { // to get value of left child
        return leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public boolean isLeftChildEmpty() {
        if (leftChild == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRightChildEmpty() {
        if (rightChild == null) {
            return true;
        } else {
            return false;
        }
    }
}

