class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
 val result = HashSet<Int>()
    for(i in 0 until nums.size){
        val num = nums[i]
        if(result.contains(num)){
            return true
        }
        result.add(num)
    }
    return false
    }
}
