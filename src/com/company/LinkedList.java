package com.company;

import java.util.NoSuchElementException;

public class LinkedList {
    LinkedListNode first = null;
    LinkedListNode last = null;

    public void addFirst(int data){
        LinkedListNode node = new LinkedListNode();
        node.setValue(data);

        if (first==null){
            first = node;
            last = node;
        }else{
            node.next = first;
            first = node;
        }
    }

    public void addLast(int data){
        LinkedListNode node = new LinkedListNode();
        node.setValue(data);

        if (first == null){
            first=node;
            last=node;
        }

        last.next = node;
        last = node;
    }

    public int getFirst(){
        if (first ==null){
            throw new NoSuchElementException();
        }
        return first.value;
    }

    public int getLast(){
        if (first == null){
            throw new NoSuchElementException();
        }
        return last.value;
    }
    public void print(){
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode = this.first;

        while(linkedListNode != null){
            System.out.println(linkedListNode.value);
            linkedListNode = linkedListNode.next;
        }
    }

    public void removeFirst(){
        first=first.next;
    }
    // It's not optimal;
    public void removeLast(){
       LinkedListNode linkedListNode = new LinkedListNode();
       linkedListNode = this.first;

       while(!linkedListNode.next.equals(last)){
           linkedListNode=linkedListNode.next;
       }
       last = linkedListNode;
       last.next = null;
    }
}
