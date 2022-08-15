#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
	// Complete this function
    int commas = 0;
    vector<string> strarr;
    strarr.push_back("");
    for (int i = 0; i < str.length(); ++i) {
        if (str.at(i) == ',') {
            commas++;
            strarr.push_back("");
        }
        else {
            strarr.at(commas) += str.at(i);
        }
    }
    vector<int> arr;
    for (int i = 0; i < strarr.size(); ++i) {
        arr.push_back(stoi(strarr.at(i)));
    }
    return arr;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
