#include<iostream>
#include<vector>
#include<queue>
#include<stack>

using namespace std;

int main(){
    int i[5];
    vector<int> v={1,2,34,55,6,7};
    
    //     cout << v.back()<< " ";
    //     cout << v.front()<< " ";
    //    cout << "Address of element" << &(*v.begin()) << endl;

// pair<string,int> p1{"cookies", 10};
// cout<<"The pair is: "<<p1.first<<" "<<p1.second<<endl;
// queue<int> q;
// q.emplace(1);
// q.emplace(2);
// q.emplace(3);
// q.emplace(4);
// q.emplace(5);
// q.push(6);
// queue<int> tempQ = q;
// cout << "Queue elements: ";
// while (!tempQ.empty()) {
//     cout << tempQ.front() <<endl;
//     tempQ.pop();
// }
//     cout << "The back of the queue is: " << q.back() << endl;
stack<int> s;
s.push(1);
s.push(2);     
s.push(3);
s.push(4);
s.push(5);
cout<< "Stack elements: ";
while (!s.empty()) {
    cout << s.top() << endl;
    s.pop();
}
    return 0;

}