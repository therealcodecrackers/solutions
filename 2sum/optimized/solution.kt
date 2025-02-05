import java.util.HashMap

internal object Solution {
    fun twoSum(arr: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in arr.indices) {
            val rem = target - arr[i]
            if (map.containsKey(rem)) {
                return intArrayOf(i, map[rem]!!)
            }
            map[arr[i]] = i
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