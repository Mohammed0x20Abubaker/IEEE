public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        String firstWord = strs[0];
        int firstWordLength = strs[0].length();
        int numberOfCommonPrefixes = 0 ;
        String commonPrefix = "";
        int listLength = strs.length;
        if (listLength == 1){
            return strs[0];
        }
        for(int i = 0 ; i < firstWordLength ; i++){
            for(int j=1 ; j<strs.length ; j++){
                int wordLength = strs[j].length();
                if(i == wordLength){
                    break ;
                }
                if(strs[j]==""){
                    break;
                }
                if(firstWord.charAt(i)==strs[j].charAt(i)){
                    if(j == strs.length - 1){
                        numberOfCommonPrefixes += 1;
                        commonPrefix = commonPrefix + firstWord.charAt(i);
                    }
                    continue;
                }
                else{
                    return commonPrefix;
                }

            }
        }
        return commonPrefix;

    }
}
