package arrayBalok;
public class balok{
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public balok(){
        
    }
    
    public balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
}