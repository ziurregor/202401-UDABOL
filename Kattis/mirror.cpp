#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    int t;
    cin >> t;

    for (int test_case = 1; test_case <= t; ++test_case) {
        int rows, cols;
        cin >> rows >> cols;

        // Input image
        vector<string> image(rows);
        for (int i = 0; i < rows; ++i) {
            cin >> image[i];
        }

        // Output test case number
        cout << "Test " << test_case << endl;

        // Output mirrored image
        for (int i = rows - 1; i >= 0; --i) {
            for (int j = cols - 1; j >= 0; --j) {
                cout << image[i][j];
            }
            cout << endl;
        }
    }

    return 0;
}