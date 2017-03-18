package ru.sanak.list;

public class ArrayList implements List {

    // максимальное количество элементов в списке
    private int MAX_LIST_SIZE = 5;

    // массив - хранилище элементов
    private int[] elements;

    // фактическое количество элементов в списке
    private int size;

    // конструктор - набор инструкций, инициализирующий поля
    public ArrayList() {
        size = 0;
        elements = new int[MAX_LIST_SIZE];
    }

    public void add(int element) {
        // проверяем, не вышли ли мы за пределы массива
        if (size == MAX_LIST_SIZE) {
            // если вышли запределы массива - изменяем размер массива
            resize();
        }

        elements[size] = element;
        size++;
    }

    public void remove(int element) {
        // получаем индекс удаляемого элемента
        int indexOfElement = getIndexOf(element);
        // если удалять нечего
        if (indexOfElement == -1) {
            System.out.println("Элемент не найден");
            // останавливаем работу метода remove
            return;
        }
        // перемещяем все элементы, находящиеся справа от удаляемого влево
        for (int i = indexOfElement; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }

        size--;
    }

    public int getByIndex(int index) {
        // если index в допустимых границцах
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
        // бежим по всем элементам списка
        for (int i = 0; i < size; i++) {
            // если нашли
            if (elements[i] == element) {
                return i;
            }
        }

        return -1;
    }

    private void resize() {
        // создали новый пустой массив, размер которого в два раза больше старого
        int newElements[] = new int[size * 2];
        // из старого массива elements скопировать все элементы в новый newElements
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
        MAX_LIST_SIZE = MAX_LIST_SIZE * 2;
    }
}
