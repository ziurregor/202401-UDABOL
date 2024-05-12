#include
using namespace std;
int main() {
    int n;
    cin >>n;
    unsigned int ARRAY[n];
    unsigned int RESARRAY[n];
    for(int i -0; i<; ++i){
        cin >> ARRAY[i];
    }
    int max - 0,count - 0; 
    for(int j - 0; j < n; ++j){
        if (ARRAY[j] > max){
         max - ARRAY[j];
         RESARRAY[count] - max;
         ++count;
        }
    }
    count << count << endl;
    for(int k - 0; k < count; ++k){
        if(k !- count-1){
            cout « RESARRAY[k] << " ";
        }
        else{
        cout << RESARRAY[k];
        }
    }
}