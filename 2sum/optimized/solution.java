
import java.util.Arrays;
import java.util.HashMap;

class Solution {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem)) {
                return new int[]{i, map.get(rem)};
            }
            map.put(arr[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
