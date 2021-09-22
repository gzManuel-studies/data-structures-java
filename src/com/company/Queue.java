package com.company;

public class Queue<S> {
    private class QueueNode {
        QueueNode next;
        QueueNode back;
        S value;

        QueueNode() {
            value = null;
            next = null;
            back=null;
        }

        public void setValue(S value) {
            this.value = value;
        }
    }

    private QueueNode front;
    private QueueNode end;

    Queue() {
        front = null;
        end = null;
    }

    public void enQueue(S data) {
        QueueNode queueNode = new QueueNode();
        queueNode.value=data;

        if (queueIsVoid()) {
            front=queueNode;
            end=queueNode;

        }else{
            end.back=queueNode;
            queueNode.next=end;
            end=queueNode;
        }
    }

    public void deQueue(){
        if (queueIsVoid()){
            System.out.println("Queue is void");

        }else if (end.next==null){
            end=null;
            front=null;
        }else{
            front = front.back;
            front.next = null;
        }
    }

    private boolean queueIsVoid(){
        if (front==null&&end ==null){
            return true;
        }
        return false;
    }
    public void print(){
        QueueNode QueueNode = new QueueNode();
        QueueNode = end;

        while(QueueNode != null){
            System.out.println(QueueNode.value);
            QueueNode = QueueNode.next;
        }
    }

}
