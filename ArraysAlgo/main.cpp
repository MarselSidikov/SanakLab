#include <iostream>
using namespace std;
int main() {

    // считывание массива с консоли
    const int n = 5;
    int a[n];

    cout << "Please, enter " << n << " elements for array:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    cout << "You enter: " << endl;

    for (int i = 0; i < n; i++) {
        cout << a[i] << ' ';
    }

    cout << endl;
    // Алгоритм поиска минимального элемента в массиве:
    // 1. Предполагаем, что первый элемент минимален
    // 2. Считываем новый элемент, сравниваем с предыдущим, берем один из них минимальным
    // 3. Повторяем 1 но уже для нового минмального
    int min = a[0];

    for (int i = 1; i < n; i++) {
        if (a[i] < min) {
            min = a[i];
        }
    }

    cout << "min of array is: " <<  min << endl;

    // Поиск элемента в массиве
    // проходим по всем элементам, пока не найдем искомый

    int soughtForElement;

    cout << "Please enter element for find: " << endl;
    cin >> soughtForElement;

    int indexOfElement = -1;
    for (int i = 0; i < n; i++) {
        if (a[i] == soughtForElement) {
            indexOfElement = i;
        }
    }

    if (indexOfElement != -1) {
        cout << "Element <"
             << soughtForElement
             << "> founded under "
             << indexOfElement
             << " index" << endl;
    } else {
        cout << "Element not founded" << endl;
    }

    cout << "All positives numbers: " << endl;
    for (int i = 0; i < n; i++) {
        if (a[i] > 0) {
            cout << a[i] << " ";
        }
    }
    cout << endl;
    // СОРТИРОВКА ПУЗЫРЬКОМ
    // есть указатели i и j.
    // i бегает в диапазоне [n-1..0]
    // j бегает в диапазоне [0..i]
    // все элементы справа от i больше, чем элементы слева от i и они уже отсортированы
    // для каждого смещения i переменная j пробегает заново все свои знаения
    // если a[j] > a[j+1],то надо их менять местами
    for (int i = n -1; i >= 0; i--) {
        for (int j = 0; j < i; j++) {
            if (a[j] > a[j+1]) {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }

    cout << "Sorted array: " << endl;
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    return 0;
}