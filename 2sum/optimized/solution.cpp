#include <iostream>
#include <unordered_map>

void twoSum(int arr[], int n, int target, int ans[]) {
    std::unordered_map<int, int> map;
    for(int i=0; i<n; i++) {
        if(map.find(target-arr[i]) != map.end()) {
            ans[0] = i;
            ans[1] = map[target-arr[i]];
            return;
        }
        map[arr[i]] = i;
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