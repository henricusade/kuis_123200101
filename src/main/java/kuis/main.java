
package kuis;
import java.util.Scanner;

public class main {
    

    
    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    
         System.out.println("FORM PENDAFTARAN");
         System.out.println("1. Android Development");
         System.out.println("2. Web Development");
         System.out.println("Pilih jenis form : ");
         int pil = Input.nextInt();
         
         System.out.print("Input NIM : "); int nim = Input.nextInt();
         System.out.print("Input Nama : "); String nama = Input.nextLine();
         System.out.print("Input Nilai Tes Tulis : ");int tls = Input.nextInt();
         System.out.print("Input Nilai Tes Coding : ");int cdg = Input.nextInt();
         System.out.print("Input Nilai Tes Wawancara : ");int wnc = Input.nextInt();
         switch (pil){
         
             case 1 : android android = new android();
                      android.innim(nim);
                      android.intls(tls);
                      android.incdg(cdg);
                      android.inwnc(wnc);
                      break;
                      
             case 2 : web web = new web();
                      web.innim(nim);
                      web.intls(tls);
                      web.incdg(cdg);
                      web.inwnc(wnc);
                      break;
         
         
         }
    }
}
