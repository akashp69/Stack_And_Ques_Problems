package com.bridgelabz;



public class LinkedLists<T> {
    Node<T> head;
    Node<T> tail;

    /**
     * add new values
     */

    public void push(T datas) {
        Node<T> newNode = new Node(datas);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     *  Display all Node with Value
     */

    public void display() {
        Node<T> current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    /**
     * Using Pop method to pop all elements
     */

    public void pop() {
        Node<T> current = head;
        while (current != null) {
            if (current == head) {
                head = head.next;
                current = head;
            }
        }
    }

    /**
     * Using peak method to find top of the Element
     */

    public T peak() {
        Node<T> current1 = head;
        return current1.data;
    }

}
