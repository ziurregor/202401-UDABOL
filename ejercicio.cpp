#include <iostream>
#include <string>
#include <algorithm>

bool esPalin(const std::string& palabra) {
    std::string palaM = palabra;
    std::transform(palaM.begin(), palaM.end(), palaM.begin(), ::tolower);

   
    palaM.erase(std::remove_if(palaM.begin(), palaM.end(), ::isspace), palaM.end());

    size_t longitud = palaM.length();

    for (size_t i = 0; i < longitud / 2; ++i) {
        if (palaM[i] != palaM[longitud - 1 - i]) {
            return false;
        }
    }
    return true;
}

int main() {
    std::string palabra;
    std::cout << "Ingresar palabra para saber si es un palindromo ";
    std::getline(std::cin, palabra);

    if (esPalin(palabra)) {
        std::cout << "'" << palabra << "'La palabra si es un palindromo" << std::endl;
    } else {
        std::cout << "'" << palabra << "'La palabra no es un palindromo" << std::endl;
    }

    return 0;
}
