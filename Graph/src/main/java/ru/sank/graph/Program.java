package ru.sank.graph;


import ru.sank.list.List;

public class Program {
    public static void main(String[] args) {

        // создали граф
        Graph graph = new GraphMatrixImpl();

        // добавили ребра
        graph.addEdge(1,5);
        graph.addEdge(1,2);
        graph.addEdge(2,5);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(5,4);
        graph.addEdge(4,3);

        // вывели граф на экран
        graph.showGraph();

        int vertexDegree = graph.vertexDegree(3);
        int vertexWithMaxDegree = graph.getVertexMaxDegree();

        graph.showNeighbors(1);

        List neighbors = graph.getNeighbors(1);
        for (int i = 0; i < neighbors.size(); i++) {
            System.out.print(neighbors.getByIndex(i)+ " ");
        }
    }
}
