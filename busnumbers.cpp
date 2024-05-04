// Bus Numbers.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int N;
    cin >> N;

    vector<int> buses(N);

    for (int i = 0; i < N; ++i) {
        cin >> buses[i];
    }

    sort(buses.begin(), buses.end());

    vector<pair<int, int>> ranges;

    int start = buses[0];
    int end = buses[0];
    for (int i = 1; i < N; ++i) {
        if (buses[i] == end + 1) {
            end = buses[i];
        }
        else {
            ranges.push_back({ start, end });
            start = end = buses[i];
        }
    }
    ranges.push_back({ start, end });

    for (const auto& range : ranges) {
        if (range.first == range.second) {
            cout << range.first << " ";
        }
        else if (range.second == range.first + 1) {
            cout << range.first << " " << range.second << " ";
        }
        else {
            cout << range.first << "-" << range.second << " ";
        }
    }
    
    cout << endl;

    return 0;
}