package ru.sanak.stack;

/**
 * Created by User on 10.03.2017.
 */
public class Stack {
    private char elements[] = new char[6];
    private int stackSize = 0;

    public void push(char c) {
        if (stackSize == elements.length){
            char newElements[] = new char[ stackSize * 2];
            for(int i = 0 ; i < elements.length ; i++){
                newElements[i]=elements[i];
            }
            elements=newElements;
        }
        elements[stackSize] = c;
        stackSize++;
    }

    public char pop() {
       stackSize--;
       return elements[stackSize];
    }

    public int size(){
        return stackSize;
    }

    public char peek() {
        return elements[stackSize - 1];
    }

}
