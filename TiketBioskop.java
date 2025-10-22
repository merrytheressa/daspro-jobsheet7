import java.util.Scanner; 
public class TiketBioskop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, totalHarga, hargaTiket = 50000;
        double diskon = 0, hargaSetelahDiskon;
        while (true) { 
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();

            if (tiket < 0){
                System.out.println("Input tidak valid. Coba kembali!");
               continue;
            }
            break;
        }
        totalHarga = tiket * hargaTiket;

        if (tiket > 10){
            diskon = 0.15;
        } else if (tiket > 4){
            diskon = 0.10;
        }
        hargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        System.out.println("Total harga: Rp " + hargaSetelahDiskon);
    }
}