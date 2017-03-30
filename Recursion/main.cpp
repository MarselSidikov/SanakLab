#include <iostream>
using namespace std;
//Найдите факториал числа

    long long fibonachi_number(int num){
        if(num == 1 || num == 2){ /*if(num < 3){*/
            return 1;
        }
        else{
            return fibonachi_number(num - 1) + fibonachi_number(num - 2);
        }
    }

    int search_multipliers(int num, int k){
        if(num/2 < k){
            return num;
        }
        if(num%k == 0){
            cout << k << endl;
        }
        k++;
        search_multipliers(num, k);
    }
//Перегрузка функций
    int search_multipliers(int num){
        return search_multipliers(num, 1);
    }

int main() {
//    cout << search_multipliers(198) << endl;
    cout << fibonachi_number(50) << endl;
    return 0;
}