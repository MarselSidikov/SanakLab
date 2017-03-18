package ru.sanak.queue;

/**
 * Created by User on 18.03.2017.
 */
public class ProgramQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue('a');
        queue.enqueue('s');
        queue.enqueue('d');
        queue.enqueue('f');
        queue.enqueue('g');
        queue.enqueue('h');
        queue.enqueue('j');
        queue.enqueue('k');
        queue.enqueue('l');
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
