#include <iostream>
#include <vector>
#include <string>
using namespace std;

string best_compromise(int n, int m, vector<string>& lines) {
    string result(m, '0');
    for (int i = 0; i < m; ++i) {
        int count0 = 0, count1 = 0;
        for (int j = 0; j < n; ++j) {
            if (lines[j][i] == '0') count0++;
            else count1++;
        }
        result[i] = (count0 >= count1) ? '0' : '1';
    }
    return result;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<string> lines(n);
        for (int i = 0; i < n; ++i) {
            cin >> lines[i];
        }
        string result = best_compromise(n, m, lines);
        cout << result << endl;
    }
    return 0;
}
