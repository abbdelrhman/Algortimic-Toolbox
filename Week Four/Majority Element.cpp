#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


int main() {
    int n;
    cin >> n;
    int A[n];
    for (int i = 0; i < n; ++i) {
        cin >> A[i];
    }
    sort(A, A + n);
    vector<int> elements;
    elements.push_back(1);
    int j=0 ;

    for (int i = 1; i < n; ++i) {
        if (A[i] == A[i - 1]) {
            elements.at(j) += 1;

        } else {
            j++;
            elements.push_back(1);

        }
    }
    for (int i = 0; i < elements.size(); ++i) {
        if (elements.at(i) > n/2){
            cout << 1 ;
            return 0 ;
        }
    }
    cout << 0 ;
    return 0;
}
