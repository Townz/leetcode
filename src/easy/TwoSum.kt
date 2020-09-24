package easy

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        var returnArray: IntArray? = null
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    returnArray = intArrayOf(i, j)
                }
            }
        }
        return returnArray
    }
}