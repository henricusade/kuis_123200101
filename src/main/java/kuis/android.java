
package kuis;


public class android {
    public int nim, tls, cdg, wnc, hsl;
    
     public android(){
         System.out.println("\n\n Android Development");
         hsl = (int) (tls*0.2 + cdg*0.5 + wnc*0.3);
         System.out.println(hsl);
     }
     
     
      public void innim(int nim){this.nim = nim;}
      public void intls(int tls){this.tls = tls;}
      public void incdg(int cdg){this.cdg = cdg;}
      public void inwnc(int wnc){this.wnc = wnc;}

}
