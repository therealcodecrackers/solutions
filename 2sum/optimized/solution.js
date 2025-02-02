var twoSum = function (arr, target) {
    const map = new Map();
    
    for (let i = 0; i < arr.length; i++) {
        const rem = target - arr[i];
        if (map.has(rem)) {
            return [i, map.get(rem)];
        }
        map.set(i, arr[i]);
    }
  };
  
  console.log(twoSum([2, 7, 11, 15], 9));
  console.log(twoSum([3, 2, 4], 6));
  console.log(twoSum([3, 3], 6));
  