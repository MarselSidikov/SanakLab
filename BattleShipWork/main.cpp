#include <iostream>
using namespace std;

// Игральная доска представляется в ввиде двух матриц
// Условные обозначения 0 - пустая 1 - неподбитая 2 - подбитая 3 - убита 4 - промах

int const d = 10; //dimension

int get_up_border(int table[d][d],int y){
    if(y == 0){
        return 0;
    } else{
        return y - 1;
    }
}


bool check(int table[d][d], int x, int y){
    int up = get_up_border(table, y);
    int down = get_down_border(table, y);




    return false;
}

void set_table(int table[d][d]){
    for(int i = 0; i < 4;){
        int x;
        int y;
        cout << "Enter x" << endl;
        cin >> x;
        cout << "Enter y" << endl;
        cin >> y;
        bool check = check(table, x, y);
        if(check){
            i++;
        }
        else{
            cout << "ТЫ ДУРАК!";
        }
    }
}

int main() {
    int table1[d][d] = {0};
    int table2[d][d] = {0};
    set_table(table1);
    set_table(table2);
    std::cout << "Hello, World!" << std::endl;
    return 0;
}