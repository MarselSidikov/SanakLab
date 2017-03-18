package ru.sanak.queue;

/**
 * Created by User on 18.03.2017.
 */
public class Queue {
    private char elements[] = new char[6];
    private int queueSize = 0;
    public void enqueue(char c){
        if (queueSize == elements.length) {
            char newElements[] = new char[queueSize * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        for (int i = queueSize ; i > 0 ; i--){
            elements[i] = elements[i - 1];
        }
        elements[0] = c;
        queueSize++;
    }

    public char dequeue(){
        return elements[--   queueSize];
    }

    public int size () {
        return queueSize;
    }

}
