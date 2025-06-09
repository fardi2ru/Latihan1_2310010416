package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika farid = new Matematika(1,6);
        
        System.out.println("Hasil Penjumlahan:"+farid.setPenjumlahan());
        System.out.println("Hasil Pengurangan:"+farid.setPengurangan());
        System.out.println("Hasil Perkalian:"+farid.setPerkalian());
        System.out.println("Hasil Pembagian:"+farid.setPembagian());
    }
    
}
