#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;




int main() {
    int n;
    int capacity;
   cin >> n >> capacity;
    vector<int> values(n);
    vector<int> weights(n);
    vector<pair<double ,int >> valuePerUnit(n) ;
    for (int i = 0; i < n; i++) {
        std::cin >> values[i] >> weights[i];
        valuePerUnit[i].second = weights[i];
        valuePerUnit[i].first= 1.0000*(values[i])/weights[i];
    }
    sort(valuePerUnit.rbegin(),valuePerUnit.rend());
    int minimum =0 , i=0 ;
    double value = 0.0;
    while (capacity && i<n){
        minimum = min(capacity , valuePerUnit[i].second);
        value+=minimum*valuePerUnit[i].first;
        capacity-=minimum;
        valuePerUnit[i].second -= minimum;
        if (valuePerUnit[i].second == 0){
            i++;
        }
    }

    printf("%.4f", value);
    return 0;
}
