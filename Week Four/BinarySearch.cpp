#include <iostream>

using namespace std;
int BinarySearch(int A[], int k, int l, int h) {
    int mid = l + (h - l) / 2;
    if (A[mid] == k) {
        return mid;
    } else if (l > h) {
        return -1;
    } else {
        if (A[mid] > k) {//left
            return BinarySearch(A, k, l, mid - 1);
        } else {
            return BinarySearch(A, k, mid + 1, h);
        }
    }
}


int main() {
    int n;
    cin >> n;
    int A[n];
    for (int i = 0; i < n; ++i) {
        cin >> A[i];
    }
    int k;
    cin >> k;
    int Q[k];
    for (int i = 0; i < k; ++i) {
        cin >> Q[i];
    }
    for (int i = 0; i <k ; ++i) {
        cout << BinarySearch(A,Q[i],0,n-1)<<" ";
    }

    return 0;
}


