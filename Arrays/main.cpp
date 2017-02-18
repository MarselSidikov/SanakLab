#include <iostream>
using namespace std;
// массив - структура данных, которая представляет собой
// набор элементов с произвольным доступом по индексу.
// размер массива задается заранее и является неизменным
// массив по сути представляет собой набор переменных определенного
// типа и пронумерованных 0..n-1
int main() {
    // константа - размерность массива
    const int n = 5;
    // объявил массив размерности 5
    int a[n];

    // положили элементы в массив
    a[0] = 6;
    a[1] = -4;
    a[2] = 7;
    a[3] = -3;
    a[4] = 2;

    // вывод массива на экран

    /** нехороший способ - используется цикл while
    int i = 0;

    while (i < 5) {
        cout << a[i] << ' ';
        i++;
    }
    **/
    for (int i = 0; i < n; i++) {
        cout << a[i] << ' ';
    }

    cout << endl;

    for (int i = n - 1; i >= 0; i--) {
        cout << a[i] << ' ';
    }

    cout << endl;

    const int m = 7;

    int b[] = {4, -2, 11, 2, 4, 7, 8};

    for (int i = m - 1; i >= 0; i--) {
        cout << b[i] << ' ';
    }

    return 0;
}