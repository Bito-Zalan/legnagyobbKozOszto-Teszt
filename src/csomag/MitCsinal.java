package csomag;

public class MitCsinal {
    /* FELADAT:
    - mit csinál?
    - mi lenne a spőecifikáció, ami alapján ezt kellett megírni?
    */
    public static int fuggveny(int a, int b) {
        if(a==0 || b==0){
          return 0;
        }
        if (a<0 || b<0){
          return -1;
        }
        while (a != b) {
          if (a > b) {
            a = a - b;
          } else {
            b = b - a;
          }
        }
        return a;
      }
    
    public static void main(String[] args) {
        System.out.println(fuggveny(9, 12));
    }
    //a kód feladata: 2 szám legnagyobb közös osztó
}
