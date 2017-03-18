package ru.sanak.list;

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
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value==element){
                return index;
            }
            index++;
            current=current.next;
        }
        return -1;
    }

    public static LinkedList merge(LinkedList aList, LinkedList bList){
        Node a = aList.head;
        Node b = bList.head;
        LinkedList result = new LinkedList();

        while(a != null && b != null){
            if (a.value >= b.value){
                result.add(b.value);
                b=b.next;
            }
            else{
                result.add(a.value);
                a=a.next;
            }
        }
        while(a!=null){
            result.add(a.value);
            a=a.next;
        }
        while(b!=null){
            result.add(b.value);
            b=b.next;
        }
        return result;
    }
    public static void Sort(LinkedList list){
        LinkedList lists[] = new LinkedList[32];

        for(int i = 0; i < lists.length; i++){
            lists[i] = new LinkedList();
        }
        int listsCount = 0;

        Node current = list.head;

        while (current != null){
            if(listsCount < 2){
                lists[0].add(current.value);
                listsCount++;
            }
        }
    }


}
