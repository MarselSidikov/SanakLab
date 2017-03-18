package ru.sanak.graph;

import ru.sanak.list.ArrayList;
import ru.sanak.list.List;

// реализация графа - матрица смежности
public class GraphMatrixImpl implements Graph {

    // матрица вершин
    private int[][] matrix;

    // конструктор, выделяет память для матрицы
    public GraphMatrixImpl() {
        // выделяем память для строк матрицы
            matrix = new int[MAX_VERTEX_COUNT][];
            // выделяем память для столбцов каждой строки
            for (int i = 0; i< MAX_VERTEX_COUNT; i++) {
                matrix[i] = new int[MAX_VERTEX_COUNT];
            }
    }

    public void addEdge(int vertexI, int vertexJ) {
        matrix[vertexI][vertexJ] = 1;
        matrix[vertexJ][vertexI] = 1;
    }

    public void showGraph() {
        // вывод матрицы смежности
        // бежим по всем строкам
        for (int i = 1; i< MAX_VERTEX_COUNT; i++) {
            // бежим по всем столбцам
            for (int j = 1; j < MAX_VERTEX_COUNT; j++) {
                // выводим элемент матрицы
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int vertexDegree(int vertex) {
        int degree = 0;
        // начинаем просматривать всю строку вершины
        for (int i = 1; i < MAX_VERTEX_COUNT; i++) {
            // если у нее имеется сосед - увеличиваем степень вершины
            if (matrix[vertex][i] == 1) {
                degree++;
            }
        }

        // возвращаем результат
        return degree;
    }

    public int getVertexMaxDegree() {
        int maxDegree = 0;
        // предполагаем, что первая вершина имеет наибольшую степень
        int vertexMax = 1;

        // бежим по всем вершинам
        for (int i = 1; i < MAX_VERTEX_COUNT; i++) {
            // запоминаем степень текущей вершины
            int currentDegree = vertexDegree(i);

            // если степень текущей вершины больше, чем та, которую
            // мы запомнили ранее
            if (currentDegree > maxDegree) {
                // теперь текущая врешина - вершина с максимальной степенью
                vertexMax = i;
                // запоминаем новую максимальную степень
                maxDegree = currentDegree;
            }
        }

        // возвращаем резульатат
        return vertexMax;
    }

    public void showNeighbors(int vertex) {
        // бежим по всем вершинам
        for (int i = 1; i < MAX_VERTEX_COUNT; i++) {
            // если для вершины vertex вершина i является соседом
            if (matrix[vertex][i] == 1) {
                // выводим вершину i на экран
                System.out.print(i + " ");
            }
        }
    }

    public List getNeighbors(int vertex) {
        /**
        // мы создаем массив для соседей вершины
        // чтобы не выделять лишнюю память, мы спрашиваем - сколько всего соседей у вершины?
        int neighborsCount = vertexDegree(vertex);

        // выделили память
        int neighbors[] = new int[neighborsCount];

        int k = 0;
        **/

        List neighbors = new ArrayList();

        // бежим по всем вершинам
        for (int i = 1; i < MAX_VERTEX_COUNT; i++) {
            // если вершина vertex имеет соседа вершину i
            if (matrix[vertex][i] == 1) {
                /**
                // закидываем ее в массив соседей
                neighbors[k] = i;
                k++;
                **/
                neighbors.add(i);
            }
        }

        // возвращаем массив соседей
        return neighbors;
    }

    public int[] neighborsGroup(int vertex) {
        int group[] = new int[MAX_VERTEX_COUNT];


        return group;
    }
}
