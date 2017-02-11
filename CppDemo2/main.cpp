#include <iostream>

using namespace std;

// произведение четных и сумма чисел оканчивающихся на 3
int main() {

    int currentValue; // текущее значение
    int evenNumbersMultiply = 0; // произвеение четных
    int dividedByThreeSum = 0; // сумма чисел оканчивающихся на 3

    cin >> currentValue;

    while (currentValue != -999) {
        if (currentValue % 10 == 3) {
            dividedByThreeSum = dividedByThreeSum + currentValue;
        }
        else if (currentValue % 2 == 0){
            evenNumbersMultiply = evenNumbersMultiply * currentValue;
        }

        cin >> currentValue;
    }

    cout << "mult of even: " << evenNumbersMultiply << " , sum of 3-end: " << dividedByThreeSum;

    return 0;
}