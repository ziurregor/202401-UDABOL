#include <iostream>
#include <vector>
#include <cmath>
#include <climits>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<pair<int, int>> ingredients(n);
    for (int i = 0; i < n; ++i) {
        cin >> ingredients[i].first >> ingredients[i].second;
    }

    int min_diff = INT_MAX;

    // Generate all possible subsets of ingredients
    for (int i = 1; i < (1 << n); ++i) {
        int sourness = 1;
        int bitterness = 0;

        // Calculate the sourness and bitterness for the current subset
        for (int j = 0; j < n; ++j) {
            if (i & (1 << j)) {
                sourness *= ingredients[j].first;
                bitterness += ingredients[j].second;
            }
        }

        // Calculate the absolute difference between sourness and bitterness
        int diff = abs(sourness - bitterness);
        min_diff = min(min_diff, diff);
    }

    cout << min_diff << endl;

    return 0;
}