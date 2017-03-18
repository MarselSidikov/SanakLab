package ru.sanak.list;

/**
 * Список - это сущность, в которую можно
 * что-то положить, что-то взять, что-то удалить
 * посмотреть количество
 */
public interface List {
    /**
     * Метод добавляет элемент в список
     * @param element - сам элемент
     */
    void add(int element);

    /**
     * Метод удаление элемента из списка
     * @param element - удаляемый элемент
     */
    void remove(int element);

    /**
     * Метод возвращает элемент из списка по
     * его порядковому номеру
     * @param index - номер элемента
     * @return сам элемент
     */
    int getByIndex(int index);

    /**
     * Возвращает количество элементов в списке
     * @return
     */
    int size();

    /**
     * Метод получения порядкового заданного элемента
     * @param element искомый элемент
     * @return его порядковый номер
     */
    int getIndexOf(int element);
}
