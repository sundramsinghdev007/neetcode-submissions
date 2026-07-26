class Solution {
    fun isPalindrome(s: String): Boolean {
        var original = ""
        for(char in s){
            if(char.isLetterOrDigit()){
                original=original+char.lowercase()
            }
        }
        return original==original.reversed()
    }
}
