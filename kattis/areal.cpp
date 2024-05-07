#include <iostream>
#include <cmath>

using namespace std;

int main() {
    double area;
    cin >> area;

    // Calcula la longitud de un lado del pasto (lado de un cuadrado)
    double lado = sqrt(area);

    // Calcula la longitud total de la cerca (perímetro de un cuadrado)
    double longitudCerca = 4 * lado;

    cout << fixed << longitudCerca << endl;

    return 0;
}