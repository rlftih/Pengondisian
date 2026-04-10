public class kondisi_1 {
    public static void main(String[] args) {
        int usia = 16;
double totalBelanja = 150000;

if (usia < 18){
    System.out.println("akses dibatasi: Di bawah umur 18 tahun");
} else if (totalBelanja >= 150000){
    System.out.println("Akses diberikan + diskon 15%");
} else{
    System.out.println("Akses diberikan tanpa diskon");
}
    }
}
