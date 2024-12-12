public class OddEvenSort {
  public static String sortMyString(String s) {
    String oddLine="", evenLine="";
    for(int i=0;i<s.length();i++)         //go by each letter
      if(i%2==0)  evenLine+=s.charAt(i);  //put letters at even and odd indexes to their corresponding strings
      else oddLine+=s.charAt(i);
    return evenLine+" "+oddLine;          //combine strings with a space between
  }
}
