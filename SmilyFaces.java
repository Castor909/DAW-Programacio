import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int counter=0;
      for(String face : arr)  {
        char[] elements = face.toCharArray();
        if(
          (elements[0]==':'||elements[0]==';')
          &&
          (elements[elements.length-1]==')'||elements[elements.length-1]=='D')
          && 
          has_correct_nose_or_no_nose_at_all(elements) 
          && 
          elements.length<4 
        ) counter++;      
      }
      return counter;
  }
  static boolean has_correct_nose_or_no_nose_at_all(char[] face) {
    if( (face.length==3))
      if (face[1]=='-'||face[1]=='~')
        return true;
      else return false;      
    return true;
  }  
}
