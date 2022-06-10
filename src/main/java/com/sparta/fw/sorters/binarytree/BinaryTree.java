package com.sparta.fw.sorters.binarytree;

import com.sparta.fw.exceptions.ChildNotFoundException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryTree implements BinaryTreeInt {

    public static Logger loggerInBinaryTree = Logger.getLogger("Logger in Binary Tree");
    //public method - Interface
    //private method - Implementation
    int numberOfElements = 1; //1 =  rootnode is stored in index 0, so we start from 1
    int[] arrayOfNumbers;

    int arrayIndex = 0;

    private final Node rootNode; // RootNode is the starter of the tree

    public BinaryTree(final int element) { //binary tree made of elements
        rootNode = new Node(element);  // instantiate rootNode as the binary tree can't be empty. element will be picked by the user
    }

    public BinaryTree(int[] elements) {
        rootNode = new Node(elements[0]);
        for (int i = 1; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }
    //create a tree (100) - create new node(100)

    public void addElement(final int element) { // add a number to the tree

        addNodeToTree(rootNode, element); // checks from the starter number, pass in the element entered

    }

    private void addNodeToTree(Node node, int element) { //node and value entered
        if (element <= node.getValue()) { // if value entered is less than the value in the node
            if (node.isLeftChildEmpty()) { // if the left child is empty
                Node leftChild = new Node(element); //create NEW left child whilst true
                node.setLeftChild(leftChild);//set left child
                numberOfElements++;
            } else {
                addNodeToTree(node.getLeftChild(), element); // recursion - false it's not empty - then you keep running conditions until true
            }
        } else if (element > node.getValue()) { // if value entered is more than the value in the node
            if (node.isRightChildEmpty()) { // if the right child is empty
                Node rightChild = new Node(element); //create new right child whilst true
                node.setRightChild(rightChild);//set right child
                numberOfElements++;
            } else {
                addNodeToTree(node.getRightChild(), element); //recursion
            }
        }
    }

    public boolean findElement(final int element) { // find the element
        Node node = findNode(element); // find node element
        if (node != null) { // if node is not null
            return true;
        }
        return false;
    }

    private Node findNode(final int element) {
        Node node = rootNode;
        while (node != null) {      // while root Node is not null (while keep doing condition until it is false)
            if (element == node.getValue()) { //if the value entered is equal to the node value
                return node; // return root node value if equal to element
            }
            if (element < node.getValue()) {  // if the value is less than the root node
                node = node.getLeftChild(); //
            } else {
                node = node.getRightChild();
            }
        }
        return null; //because you have the smallest value as there is no lower value on the left
    }

    public int getRootElement() { // return the value at the element
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() { // recursion . get left child / get right child
        return numberOfElements;
    } // number of elements


    @Override
    public int[] getSortedTreeAsc() {
        return sortedTreeAsc();
    }

    private int[] sortedTreeAsc() { //not recurse, add array
        arrayOfNumbers = new int[numberOfElements];// empty array will be the length of number of elements required
        inOrderAsc(rootNode); //starting with the root node value
        arrayIndex = 0; // this is when we call method again it will need to be at 0 index
        return arrayOfNumbers; //return array of numbers
    }

    private void inOrderAsc(Node node) { //recursive method
        if (node == null) { // no need to write again, as I'm using recursive
            return; //doesn't do anything because of void
        }
        inOrderAsc(node.getLeftChild());// recursive method to get to the ascending left child nodes
        arrayOfNumbers[arrayIndex] = node.getValue(); // empty array[starting with first digit] returns the value of node (most left node)
        arrayIndex++; // index is increased each time ran - so that it stores node values in separate index numbers
        inOrderAsc(node.getRightChild()); //recursive method to get to the ascending right child nodes

    }

    @Override
    public int[] getSortedTreeDesc() {
        return sortedTreeDesc();
    }

    private int[] sortedTreeDesc() { //not recurse, add array
        arrayOfNumbers = new int[numberOfElements];// empty array will be the length of number of elements required
        inOrderDesc(rootNode); //starting with the root node value
        arrayIndex = 0; // this is when we call method again it will need to be at 0 index
        return arrayOfNumbers; //return array of numbers
    }


    private void inOrderDesc(Node node) {
        if (node == null) { // no need to write again, as I'm using recursive
            return; //doesn't do anything because of void
        }
        inOrderDesc(node.getRightChild());// recursive method to get to the ascending left child nodes
        arrayOfNumbers[arrayIndex] = node.getValue(); // empty array[starting with first digit] returns the value of node (most left node)
        arrayIndex++; // index is increased each time ran - so that it stores node values in separate index numbers
        inOrderDesc(node.getLeftChild());//recursive method to get to the ascending right child nodes
    }


    @Override
    public int getLeftChild(int element) throws ChildNotFoundException { // make an  exception for that
        if (findElement(element)) { //if the element entered
            Node node = findNode(element); //if the value within the node equals the element entered then return the node value
            if (!node.isLeftChildEmpty()) { // if node is not empty on the left child
                node = node.getLeftChild(); // then get left child
                return node.getValue(); // return node value (if the value is a value on the left child)
            }
            throw new ChildNotFoundException("Access Denied - number must be greater than 0"); // message when left child is not found
        } else {
            throw new ChildNotFoundException("Access Granted - Successful number entered");// message when left child is not found
        }
    }


    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if (findElement(element)) { //find element
            Node node = findNode(element); //find node element
            if (!node.isRightChildEmpty()) { // if node is not
                node = node.getRightChild();
                return node.getValue();
            }
            throw new ChildNotFoundException("Access Denied - number must be greater than 0");
        } else {
            throw new ChildNotFoundException("Access Denied - number must be greater than 0");
        }
    }

    public void addElements(int[] elements) { // user will input array of numbers

        for (int i : elements) {
            addElements(new int[i]);

        }loggerInBinaryTree.setLevel(Level.ALL);
        System.out.println(loggerInBinaryTree.getLevel());
        loggerInBinaryTree.log(Level.INFO, "an element has been added to the Binary Tree");
    }

    }





