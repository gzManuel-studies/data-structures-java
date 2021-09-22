package com.company;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.push("Claudia");
        stack.push("Manuel");
        stack.push("Alejandra");
        stack.pop();
        stack.print();
    }
}
