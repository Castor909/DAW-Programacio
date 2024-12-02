public class PeacefulYard {
    private int x;
    private int y;

    public PeacefulYard(int x, int y) {
        this.x = x;
        this.y = y;
    }
  
    public boolean isSet()  {
      return (x!=-1)&&(y!=-1);
    }
    public boolean isSafeFrom(PeacefulYard other, int minDistance)  {
      return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2))>=(double)minDistance;
    }
  
    public static boolean peacefulYard(String[] yard, int minDistance) {
      PeacefulYard R = new PeacefulYard(-1,-1);
      PeacefulYard L = new PeacefulYard(-1,-1);
      PeacefulYard M = new PeacefulYard(-1,-1);
      
      for(int i=0;i<yard.length; i++) {
        for(int j=0;j<yard[0].length();j++) {
          switch(yard[i].charAt(j)) {
              default:
                continue;
              case 'R':
                R = new PeacefulYard(i,j);
                break;
              case 'L':
                L = new PeacefulYard(i,j);
                break;
              case 'M':
                M = new PeacefulYard(i,j);
                break;
          }
        }
      }
      if(R.isSet()&& L.isSet()) {
        if (!R.isSafeFrom(L,minDistance)) return false;
      }
      if(R.isSet()&& M.isSet()) {
        if (!R.isSafeFrom(M,minDistance)) return false;
      }
      if(M.isSet()&& L.isSet()) {
        if (!M.isSafeFrom(L,minDistance)) return false;
      }
      return true;
      
    }
}
