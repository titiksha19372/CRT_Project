#include<iostream>
using namespace std;
int main(){
    int arr[5] = {10, 20, 30, 40, 50};
    for(int i=0; i<5; i++){
        cout << "Element at index " << i << " is: " << arr[i] << endl;
    }
    cout <<"                                                "<< endl;
    int i=0;
    while(i<5){
        cout << "Element at index " << i << " is: " << arr[i] << endl;
        i++;
    }
    do
    {
        cout << "Element at index " << i << " is: " << arr[i] << endl;
        i++;
    } while (i<5);
    cout << "End of array traversal." << endl;
    
}      