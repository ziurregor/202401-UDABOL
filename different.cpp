#include <iostream>
using namespace std;

int main() {
    long long a, b;
    while (cin >> a >> b) {
        long long diferencia;
        if (a > b) {
            diferencia = a - b;
        } else {
            diferencia = b - a;
        }
        cout << diferencia << endl;
    }
    return 0;
}
