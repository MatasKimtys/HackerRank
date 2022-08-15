#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    string a, b;
    getline(cin, a);
    getline(cin, b);
    int a_length, b_length;
    a_length = a.size();
    b_length = b.size();
    cout << a_length << " " << b_length << endl;
    string sum_ab = a + b;
    cout << sum_ab << endl;
    string temp_b = b;
    string temp_a = a;
    temp_b.at(0) = a.at(0);
    temp_a.at(0) = b.at(0);
    a = temp_a;
    b = temp_b;
    cout << a << " " << b;
    return 0;
}
