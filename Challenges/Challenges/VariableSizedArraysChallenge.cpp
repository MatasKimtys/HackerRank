#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
int a, b;
    scanf("%d %d", &a, &b);
    vector<vector<int>> box;
    vector<int> emptyVector;
    for (int i = 0; i < a; ++i) {
        box.push_back(emptyVector);
        int c, cc;
        scanf("%d", &c);
        for (int j = 0; j < c; ++j) {
            scanf("%d", &cc);
            box.at(i).push_back(cc);
        }
    }
    int x;
    int y;
    for(int i = 0; i < b; ++i){
        scanf("%d %d", &x, &y);
    cout << box.at(x).at(y) << endl;
    }
    return 0;
}
