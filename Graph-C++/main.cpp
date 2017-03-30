#include <iostream>
using namespace std;
int main() {
    int graph_elem = 5;
//    bool graph[graph_elem][graph_elem];
    int graph[graph_elem][graph_elem];

    for(int i=0; i<graph_elem; i++){
        cout << "Введите связи между графами" << endl;
        for(int j=0; j<graph_elem ; j++)
        {
            cout << i << " вершина связана с " << j << "?" << endl;
            bool select;
            cin >> select;
            if(select){
                graph[i][j] = 1;
            }
            else
            {
                graph[i][j] = 0;
            }
        }
    }

//    Поиск вершины (точеки) имеющий наибольшее количество ребер (связей)
    int max_link = 0;
    int max_vertex = 0;
    for(int i=0 ; i<graph_elem; i++){
        int count_link = 0;
        for(int j=0; j<graph_elem ; j++)
        {
            if(graph[i][j]>0)
                count_link++;
        }
        if(count_link > max_link)
        {
            max_link = count_link;
            max_vertex = i;
        }
    }
    cout << "Вершина имеющая самое большое количество ребер это " << max_vertex << endl;

}