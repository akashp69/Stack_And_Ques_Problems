package com.bridgelabz;

public class LinkedListMain {
    /**
     *This is main Method is Using for deques elements
     */

        public static void main(String[] args) {
            LinkedLists oparetionQueue = new LinkedLists();
            oparetionQueue.append(56);
            oparetionQueue.append(30);
            oparetionQueue.append(70);

            oparetionQueue.display();
            oparetionQueue.dequeue();
        }

    }

