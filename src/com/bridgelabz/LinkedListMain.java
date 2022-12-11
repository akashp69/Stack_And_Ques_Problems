package com.bridgelabz;

public class LinkedListMain {
    /**
     *This is main Method is Using for create a stack and add values
     */
    public static void main(String[] args) {
        LinkedLists operationStack = new LinkedLists();
        operationStack.push(70);
        operationStack.push(30);
        operationStack.push(56);
        operationStack.display();
        System.out.println("Peak Element is = " + operationStack.peak());
        operationStack.pop();


    }

}
