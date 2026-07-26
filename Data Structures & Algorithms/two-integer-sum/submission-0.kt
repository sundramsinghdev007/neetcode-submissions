class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = HashMap<Int,Int>()
    for(i in 0 until nums.size){
        val diff = target - nums[i]
        if(result.containsKey(diff) && result.get(diff)!=i){
            return intArrayOf(result.get(diff)!!,i)
        }
        result.put(nums[i],i)
    }
    return intArrayOf()
    }
}
