#include <iostream>
using namespace std;

int main(int argc, char* argv[]) {
//    Длинна масива
    int lenght;

    cout << "Enter lenght" << endl;

    cin >> lenght;

    int mass[lenght];

    cout << "Enter number" << endl;

//    Ввод данных в массив
    for(int i = 0; i < lenght; i++)
    {
        cout << "Enter elem " << i << endl;
        cin >> mass[i];
    }

//    Показать исходный порядок элементов в массиве
    cout << "Original array" << endl;

    for(int i = 0; i < lenght; i++)
    {
        cout << mass[i] << " ";
    }
    cout << endl;


    int minimal_index;

//    Алгоритом сортировкми выборкой
    for(int j = 0; j < lenght; j++) {
//        Инициализируем минимальный этемент
        minimal_index = j;
//        Находим в промежутке самый минимальный элемент
        for (int i = j; i < lenght; i++) {
//            Сраниваем елементы массива.
//            Если находится элемент меньше того элемента который педположительно был минимальный
//            запомнимаем его индекс
            if (mass[minimal_index] > mass[i]) {
                minimal_index = i;
            }
        }
//        Инициализируем временную переменную для сохранения данных
        int temp = mass[j];
//        Меняем местами значения эелементов в массиве
        mass[j] = mass[minimal_index];
        mass[minimal_index] = temp;
    }

//    Отсортированный массив
    cout << "Sort array" << endl;
    for(int i = 0; i < lenght; i++)
    {
        cout << mass[i] << " ";
    }

    return 0;
}