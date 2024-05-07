#include <iostream>

using namespace std;

double squareRoot(double area) {
    double epsilon = 1e-9; // precisión deseada
    double start = 0.0, end = area; // intervalo de búsqueda

    // Búsqueda binaria para encontrar la raíz cuadrada
    while (end - start > epsilon) {
        double mid = (start + end) / 2;
        if (mid * mid > area) {
            end = mid;
        } else {
            start = mid;
        }
    }

    return start;
}

int main() {
    double area;
    cin >> area;

    // Calcula la longitud de un lado del pasto (lado de un cuadrado)
    double lado = squareRoot(area);

    // Calcula la longitud total de la cerca (perímetro de un cuadrado)
    double longitudCerca = 4 * lado;

    cout << fixed << longitudCerca << endl;

    return 0;
}
