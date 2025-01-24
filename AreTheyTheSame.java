import java.util.HashMap;
public class AreSame {
  
	public static HashMap<Integer, Integer> arrayToHashMap(int[] array, int power)  {
    HashMap<Integer, Integer> result = new HashMap<>();
    for(int number : array) {
      int numberPowered = (int)Math.pow(number,power);
      result.put(numberPowered,result.getOrDefault(numberPowered,0)+1);
      }
    return result;
  }
  
	public static boolean comp(int[] a, int[] b) {
    if(a==null
     ||b==null
     ||a.length!=b.length) return false;
    
    if(a.length==0&&b.length==0) return true;
    
    HashMap<Integer, Integer> firstHashMap = arrayToHashMap(a,2),
                              secondHashMap = arrayToHashMap(b,1);
    
    for(Integer numberInA : firstHashMap.keySet())  {
      if(!secondHashMap.containsKey(numberInA)
        ||
        secondHashMap.get(numberInA)!=firstHashMap.get(numberInA))
        return false;
    }
    return true;
  } 
}
