package minggu3;
import java.util.Scanner;
public class loopPersegiPanjangMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();
        loopPersegiPanjang[] ppArray = new loopPersegiPanjang[panjangArray];
        System.out.println();
        
        for(int i=0; i<panjangArray; i++){
            ppArray[i] = new loopPersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
            System.out.println();
        }
        for(int i=0; i<panjangArray; i++){
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
            System.out.println();
        }
    }
}