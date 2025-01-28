public class Kata {
// 'R' char code is 82
// 'G' char code is 71
// 'B' char code is 66

// R+R=164
// G+G=142
// B+B=132
  
// R+G=153
// R+B=148
// G+B=137
  
  public static char triangle(final String row) {
    if(row.length()==1) return row.charAt(0);
    if(row.length()==2) {
      char[] twoChars = row.toCharArray();
      int sumChars = twoChars[0]+twoChars[1];
      switch(sumChars)  {
          case 164:
          case 137:
            return 'R';
          case 142:
          case 148:
            return 'G';
          case 132:
          case 153:
            return 'B';      
      }
    }
    String newLine = "";
    for(int i=1;i<row.length();i++)
      newLine+=triangle(
      (Character.toString(row.charAt(i-1)))
      +
      (Character.toString(row.charAt(i)))
    );
    return triangle(newLine);
  }
}
