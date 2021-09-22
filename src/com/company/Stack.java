package com.company;

public class Stack <S>{
    private class StackNode{
        StackNode next;
        StackNode back;
        S value;
        StackNode(){
            next=null;
            back=null;
        }
    }
    StackNode top;
    Stack(){
        top=null;
    }
    public void push(S value){
        StackNode stackNode = new StackNode();
        stackNode.value=value;
        if (top != null) {
            top.next = stackNode;
            stackNode.back = top;
        }
        top = stackNode;
    }
    public void pop(){
        if (top==null){
            System.out.println("It's void");
        }else{
            StackNode back = top.back;
            back.next =null;
            top = back;
        }
    }
    public void print(){
        StackNode StackNode = new StackNode();
        StackNode = this.top;

        while(StackNode != null){
            System.out.println(StackNode.value);
            StackNode = StackNode.back;
        }
    }
}
