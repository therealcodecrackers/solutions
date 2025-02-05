object Solution {
    fun twoSum(arr: IntArray, target: Int): IntArray {
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i != j && arr[i] + arr[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 7, 11, 15)
        val target = 9

        val result = twoSum(arr, target)
        println(result.contentToString())
    }
}