package ru.sanak.graph;

import ru.sanak.list.List;

/**
 * Интерфейс - граф, описывает множество вершин и множество ребер
 */
public interface Graph {

    // тут мы задаем количество возможных вершин
    // так нумерация вершин с первой, мы 0-вую вершину просто резервируем, но не используем
    int MAX_VERTEX_COUNT = 5 + 1;

    // метод добавления ребра
    // добавляем ребро между вершинами vertexI и vertexJ
    void addEdge(int vertexI, int vertexJ);

    // вывод графа
    void showGraph();

    // показать количество соседей вершины
    int vertexDegree(int vertex);

    // определение вершины с максимальном количеством соседей
    // метод возвращает номер вершины с наибольшим количеством соседей
    int getVertexMaxDegree();

    // показать соседей
    void showNeighbors(int vertex);

    // получить МАССИВ всех соседей вершины
    List getNeighbors(int vertex);

    // получить группу вершины - компоненту связности
    int[] neighborsGroup(int vertex);
}
