package ru.sank.list;

// Связный список - набор элементов, связанных между собой
public class LinkedList implements List {

    // Узел - первый узел списка
    private Node head;
    private Node tail;

    // размер списка
    private int size;

    /**
     * Добавление элемента в конец связного списка без использования указателя на конец списка
     * @param element - сам элемент
     */
    /**
    public void add(int element) {
        Node newNode = new Node();
        newNode.value = element;
        // если список был пуст
        if (head == null) {
            // создали новый узел
            head = newNode;
        } else {
            // создаем указатель current и указываем на начало списка
            Node current = head;
            // пока не дошли до конца
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }**/

    /**
     * Добавления элемента в конец списка с использованием указателя на последний элемент
     * @param element - сам элемент
     */
    public void add(int element) {
        Node newNode = new Node();
        newNode.value = element;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }

        size++;
    }

    public void remove(int element) {
        // если список пуст - останавливаем выполение метода
        if (head == null) {
            return;
        }

        // есди первый элемент - удаляемый
        if (head.value == element) {
            // смещаем голову списка
            head = head.next;
            size--;
            return;
        }

        Node current = head;

        // прошли по всему списку, пока не нашли удаляемый элемент
        while (current.next.value != element) {
            current = current.next;
        }

        // после того, как мы прошли весь список, в current содержится узел, следующий после которого - необходимо удалить
        current.next = current.next.next;
        size--;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index <= size) {
            // начинаем с начала списка
            Node current = head;
            // начинаем вести отсчет
            int currentIndex = 0;
            // пока не сделали нужное количество шагов
            while (currentIndex != index) {
                // идем дальше
                current = current.next;
                currentIndex++;
            }
            // возвращаем полученное значение
            return current.value;
        } else {
            System.out.println("Неверный индекс");
            return -1;
        }
    }

    public int size() {
        return size;
    }

    public int getIndexOf(int element) {
        return 0;
    }
}
