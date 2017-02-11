package ru.sank.list;

public class ArrayList implements List {

    // максимальное количество элементов в списке
    private final static int MAX_LIST_SIZE = 5;

    // массив - хранилище элементов
    private int[] elements;

    // фактическое количество элементов в списке
    private int size;

    public ArrayList() {
        size = 0;
        elements = new int[MAX_LIST_SIZE];
    }

    public void add(int element) {
        if (size == MAX_LIST_SIZE) {
            resize();
        }

        elements[size] = element;
        size++;
    }

    public void remove(int element) {
        int indexOfElement = getIndexOf(element);

        if (indexOfElement == -1) {
            System.out.println("Элемент не найден");
            return;
        }

        for (int i = indexOfElement; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }

        size--;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            System.out.println("Неверный индекс");
            return -1;
        }
    }

    public int size() {
        return size;
    }

    public int getIndexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }

        return -1;
    }

    private void resize() {
        // задача - создать новый массив newElements размера size * 2
        // из старого массива elements скопировать все элементы в новый newElements
        // elements = newElements;
    }
}
