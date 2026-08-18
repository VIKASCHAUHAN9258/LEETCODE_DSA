class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Created a container naming result
        StringBuilder result = new StringBuilder();
        // Then sorted the array
        Arrays.sort(strs);
        // First String extract
        char[] first = strs[0].toCharArray();
        // Second String extract
        char[] last = strs[strs.length-1].toCharArray();
        // Loop from 0 to length of array
        for(int i=0; i<first.length; i++){
        // Condition if when character does not match then break    
            if(first[i]!=last[i]){
                break;
           
            }
            // Append will store Matching characters in Result container
                 result.append(first[i]);
        }
        return result.toString();
    }
}