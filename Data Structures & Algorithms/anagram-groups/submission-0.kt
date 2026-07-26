class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableMapOf<String, MutableList<String>>()
	for(i in strs){
       val sortedValue = i.toCharArray().sorted().joinToString("")
       result.getOrPut(sortedValue){ mutableListOf() }.add(i)
    }
    return result.values.toList()
}
}