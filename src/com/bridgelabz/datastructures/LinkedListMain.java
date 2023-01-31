package com.bridgelabz.datastructures;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.append(56);
        integerLinkedList.append(30);
        integerLinkedList.append(40);
        integerLinkedList.append(70);
        integerLinkedList.append(38);
        integerLinkedList.display();
        integerLinkedList.deleteNode(40);
        integerLinkedList.display();
        System.out.println("size of list is " + integerLinkedList.size());

    }
}
