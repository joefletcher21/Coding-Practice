/*
Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
 
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
*/    
    
    public String findLongestCommonPrefix(String[] arr){
        String smallestElement = arr[0];
        for(int i = 1; i < arr.length(); i++){
            if(arr[i].length() < smallestElement.length)
                smallestElement = arr[i];
            }
         String targetPrefix = smallestElement;
         
         for(int i = 0; i<arr.length();i++){
             if(!arr[i].contains(targetPrefix){
                 targetPrefix = targetPrefix.substring(0,targetPrefix.length()-1)
                 for(int c = targetPrefix.length(); c >= 0; c--){
                     if(arr[i].contains(
         }
        }
    
    }
