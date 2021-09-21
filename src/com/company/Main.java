package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList linkedListInts = new LinkedList();
        linkedListInts.addFirst(10);
        linkedListInts.addFirst(15);
        linkedListInts.addFirst(30);
        linkedListInts.addLast(40);
//        linkedListInts.print();

        linkedListInts.addLast(23);
        linkedListInts.addFirst(100);
        linkedListInts.removeLast();
        linkedListInts.print();

    }
}
