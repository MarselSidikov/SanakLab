#include <iostream>

using namespace std;

// cout - ConsoleOUTput - механизм для вывода информации в консоль
// cout << i; - означает, что содержимое переменной i следует вывести в консоль
// cout << i << endl; - означет, что нужно вывести содержимое переменной i в консоль, и перевести вывод на новую строку
// cout << i << b; - вывести друг за другом значения переменных i и b
// cout << i << " " << b; - вывести через пробел

// cin - ConsleINput - механизм для чтения с консоли
// cin >> i; - считать с консоли значение и положить в переменную i
// cin >> i >> j; - считать значение с консоли до пробела и положить в i, считать значение после пробела и положить в j
int main() {

    int currentValue; // текущее значение
    int evenNumbersCount = 0; // количество четных
    int unevenNumbersCount = 0; // количество нечетных

    cin >> currentValue;

    while (currentValue != -99) {
        // если остаток от деления на 2 равен нулю - число четное
        if (currentValue % 2 == 0) {
            // evenNumbersCount = evenNumbersCount + 1;
            evenNumbersCount++;
        } else {
            unevenNumbersCount++;
        }

        cin >> currentValue;
    }

    cout << "evens count: " << evenNumbersCount << " , uneven count: " << unevenNumbersCount;

    return 0;
}