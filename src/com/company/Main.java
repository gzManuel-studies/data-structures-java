package com.company;

public class Main {

    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();

        myQueue.enQueue("Manuel");
        myQueue.enQueue("Claudia");
        myQueue.enQueue("Alejandra");
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.print();
    }
}
