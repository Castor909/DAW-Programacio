import java.util.HashMap;
public class Scramblies {
    // looks if there is enough occurences in word1 of each character of word2
    public static boolean scramble(String str1, String str2) {  
      HashMap<Character, Integer> letterMap1 = letterCounter(str1),
                                  letterMap2 = letterCounter(str2);
      for(Character letterOfTheTargetWord : letterMap2.keySet()) 
        if(letterMap1.getOrDefault(letterOfTheTargetWord,0) 
           < letterMap2.get(letterOfTheTargetWord))  
          return false;
      return true;
    }
    // takes in a word and returns a pair "character - number of occurences"
    public static HashMap<Character, Integer> letterCounter(String word)  {
      HashMap<Character, Integer> result = new HashMap<>();
      for(char letter : word.toCharArray())
        result.put(letter, result.getOrDefault(letter,0)+1);
      return result;
    }
}
