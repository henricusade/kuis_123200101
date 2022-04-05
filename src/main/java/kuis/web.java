
package kuis;


public class web {
    public int nim, tls, cdg, wnc, hsl;
    
    public web(){
        System.out.println("\n\n Web Development");
        hsl = (int) (tls*0.4 + cdg*0.35 + wnc*0.25);
        System.out.println(hsl);
    }
    
      public void innim(int nim){this.nim = nim;}
      public void intls(int tls){this.tls = tls;}
      public void incdg(int cdg){this.cdg = cdg;}
      public void inwnc(int wnc){this.wnc = wnc;}
}
