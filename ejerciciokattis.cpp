//ejercicio de kattis  Saving Daylight
#include <iostream>
#include <sstream>

using namespace std;

int main() {
    string mes, hora1, hora2;
    int dia, año;

    while (cin >> mes >> dia >> año >> hora1 >> hora2) {
        stringstream ss1(hora1);
        stringstream ss2(hora2);
        string hora_str1, min_str1, hora_str2, min_str2;
        getline(ss1, hora_str1, ':');
        getline(ss1, min_str1, ':');
        getline(ss2, hora_str2, ':');
        getline(ss2, min_str2, ':');

        int horas = stoi(hora_str2) - stoi(hora_str1);
        int min1 = stoi(min_str1), min2 = stoi(min_str2);
        int minutos;

        if (min1 > min2) {
            horas--;
            minutos = min2 + 60 - min1;
        } else {
            minutos = min2 - min1;
        }

        cout << mes << " " << dia << " " << año << " " << horas << " horas " << minutos << " minutos" << endl;
    }

    return 0;
}
