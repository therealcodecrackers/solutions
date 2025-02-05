#include <iostream>

void twoSum(int arr[], int n, int target, int ans[]) {
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            if(i!=j && arr[i]+arr[j] == target) {
                ans[0] = i;
                ans[1] = j;
            }
        }
    }
}

int main() {
    int arr[] = {2, 7, 11, 15};
    int ans[] = {-1, -1};
    int target = 9;

    twoSum(arr, 4, target, ans);
    std::cout << ans[0] << "," << ans[1];

    return 0;
}