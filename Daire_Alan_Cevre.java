package DaireAlanDilimiBulanProgram;
import java.util.Scanner;
public class Daire_Alan_Cevre {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int r, a; 
        double alan, cevre,daireDilimi,pi = 3.14;
        
        try{
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        a = input.nextInt();
        } finally{input.close();}
           
        cevre =(2*pi*r);
        alan = (pi*r*r);
        daireDilimi=(pi*(r*r)*a)/360;
        
        System.out.println("Dairenin Çevresi : "+cevre);
        System.out.println("Dairenin Alanı : "+alan);
        System.out.println("Daire Dilimi Alanı : "+daireDilimi);

    
    }
}
