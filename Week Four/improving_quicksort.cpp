#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;




pair<int, int> partition3(vector<int> &a, int l, int r)
{
    int x = a[l];
    int start = l;
    int end = r;
    int i = l;
    while (i <= end)
    {
        if (a[i] < x)
        {
            swap(a[i], a[start]);
            start++;
            i++;
        }
        else if (a[i] > x)
        {
            swap(a[i], a[end]);
            end--;
        }
        else
        {
            i++;
        }
    }
    pair<int,int> terminals ;
    terminals.first=start;
    terminals.second=end;
    return terminals;
}
void randomized_quick_sort(vector<int> &a, int l, int r) {
    if (l >= r) {
        return;
    }

    int k = l + rand() % (r - l + 1);
    swap(a[l], a[k]);
    pair<int, int> terminal = partition3(a, l, r);
    int m1 = terminal.first;
    int m2 = terminal.second;
    randomized_quick_sort(a, l, m1 - 1);
    randomized_quick_sort(a, m2 + 1, r);
}

int main() {
    int n;
    std::cin >> n;
    vector<int> a(n);
    for (size_t i = 0; i < a.size(); ++i) {
        std::cin >> a[i];
    }

    randomized_quick_sort(a, 0, a.size() - 1);
    for (size_t i = 0; i < a.size(); ++i) {
        std::cout << a[i] << ' ';
    }

}

