package ru.sanak.stack;

/**
 * Created by User on 10.03.2017.
 */
public class ProgramStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push('s');
        stack.push('d');
        stack.push('u');
        stack.push('y');
        stack.push('e');
        stack.push('f');
        stack.push('h');
        stack.push('w');
        stack.push('r');
        stack.push('t');
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
