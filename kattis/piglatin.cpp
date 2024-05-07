#include <iostream>
#include <string>
#include <sstream>

using namespace std;

// Function to check if a character is a vowel
bool isVowel(char c) {
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
}

// Function to translate a word to Pig Latin
string translateWordToPigLatin(const string& word) {
    if (isVowel(word[0])) {
        return word + "yay";
    } else {
        int vowel_index = 0;
        for (int i = 1; i < word.length(); ++i) {
            if (isVowel(word[i])) {
                vowel_index = i;
                break;
            }
        }
        return word.substr(vowel_index) + word.substr(0, vowel_index) + "ay";
    }
}

int main() {
    string line;
    while (getline(cin, line)) {
        istringstream iss(line);
        string word;
        bool first_word = true;
        while (iss >> word) {
            if (!first_word) {
                cout << " ";
            } else {
                first_word = false;
            }
            cout << translateWordToPigLatin(word);
        }
        cout << endl;
    }
    return 0;
}