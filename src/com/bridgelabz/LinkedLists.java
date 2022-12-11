package com.bridgelabz;

public class LinkedLists<T> {
    Node<T> head;
    Node<T> tail;

    /**
    *Append data One By One
     */
    public void append(T data) {
        Node <T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     *Display all the Node with value
     */
    public void display() {
        Node <T> current = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}
