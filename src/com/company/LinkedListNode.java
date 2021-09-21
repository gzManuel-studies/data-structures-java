package com.company;

public class LinkedListNode {
    int value;
    LinkedListNode next;
    void link(LinkedListNode node) {
        this.next = node;
    }

    public void setValue(int value) {
        this.value = value;
    }
}