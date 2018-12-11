/*
You have a list of words and a pattern, and you want to know which words in words matches the pattern.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)

Return a list of the words in words that match the given pattern. 

You may return the answer in any order.
*/
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> matched = new ArrayList<String>();
        for (int  i = 0; i < words.length; i++){
            String current = words[i];
            if (isMatching(current, pattern))
                matched.add(current);
        }
        return matched;
    }
    boolean isMatching(String word, String pattern){
        if (word.length() != pattern.length())
            return false;
        TreeMap<Character,Character> letterMap = new TreeMap<>();
        for (int i = 0; i < pattern.length(); i++){
            char current = pattern.charAt(i);
            letterMap.put(current, null);
        }
        for (int i = 0; i < word.length(); i++){
            char current = word.charAt(i);
            char key = pattern.charAt(i);
            if (letterMap.get(key) == null)
                letterMap.put(key,current);
            else{
                if (letterMap.get(key) != current)
                    return false;
            }
        }
        ArrayList<Character> values = new ArrayList <>(letterMap.values());
        for (int  i = 0; i < values.size(); i++){
            for (int j = i + 1; j < values.size(); j++){
                if (values.get(i) == values.get(j))
                    return false;
            }
        }
        return true;
    }
}
