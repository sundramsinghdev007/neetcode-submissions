class Solution {
    fun isAnagram(s: String, t: String): Boolean {
    if(s.length!=t.length)
    	return false
    val tMap = HashMap<Char,Int>()
    val sMap = HashMap<Char,Int>()
    for(i in s.indices){
        tMap[t[i]]=tMap.getOrDefault(t[i],0)+1
        sMap[s[i]]=sMap.getOrDefault(s[i],0)+1
    }
   return tMap==sMap
}
}
