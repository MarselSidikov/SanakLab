#include <iostream>

using namespace std;

//Обьявляем функцию
int ads(int num);

int main() {
    int num;
    int result;

    cout << "Взятие модуля числа" << endl << "Введите число" << endl;

    cin >> num;

    //Вызываем функцию
    result = ads(num);

    cout << "Модуль числа " << num << " равен " << result;

    return 0;
}

//Описываем работу функции
int ads(int num) {
    if(num < 0){
        return num * -1;
    }
    return num;
}

