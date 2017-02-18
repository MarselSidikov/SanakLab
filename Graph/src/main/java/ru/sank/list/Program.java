package ru.sank.list;

public class Program {
    public static void main(String[] args) {
        // List list = new ArrayList();
        List list = new LinkedList();

        list.add(10);
        list.add(5);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(15);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getByIndex(i) + " ");
        }

        System.out.println();
        System.out.print("After delete:");

        list.remove(16);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.getByIndex(i) + " ");
        }
    }
}
