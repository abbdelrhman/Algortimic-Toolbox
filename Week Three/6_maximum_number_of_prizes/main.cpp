#include <iostream>
#include <vector>

using namespace std;

vector<int> optimal_summands(int n) {
    int req = n*2;
    int x = 0 ;
    int exp =0;
    while (exp < req){

        x++;
        exp =x*x+ x;
    }
    while (exp > req){
        x--;
        exp=x*x+ x;
    }
    vector<int> summands;
    if (exp == req){
        for (int i = 1; i <=x ; ++i) {
            summands.push_back(i);
        }
    } else{
        int temp = n  ;
        for (int i=1 ; i<x ; i++){
            summands.push_back(i);
            temp-=i;
        }
        summands.push_back(temp);
    }
    //write your code here
    return summands;
}

int main() {
    int n;
    std::cin >> n;
    vector<int> summands = optimal_summands(n);
    std::cout << summands.size() << '\n';
    for (size_t i = 0; i < summands.size(); ++i) {
        std::cout << summands[i] << ' ';
    }
}
