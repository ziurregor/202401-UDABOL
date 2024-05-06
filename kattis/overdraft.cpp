#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> transactions(n);
    int balance = 0;
    int min_balance = 0;

    for (int i = 0; i < n; ++i) {
        cin >> transactions[i];
        balance += transactions[i];
        min_balance = min(min_balance, balance);
    }

    if (min_balance < 0) {
        cout << -min_balance << endl;
    } else {
        cout << "0" << endl;
    }

    return 0;
}