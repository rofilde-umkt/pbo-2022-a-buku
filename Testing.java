import peminjaman.Mahasiswa;
import peminjaman.Penulis;
import peminjaman.Penerbit;
import peminjaman.Buku;
import peminjaman.Prodi;

public class Testing {
    public static void main(String[] args) {
        Buku bukuPbo = new Buku();
        bukuPbo.setData("Pemrograman Berorientasi Objek dengan Menggunakan Java", 2022, 235);
        bukuPbo.tampilData();

        System.out.println(bukuPbo.getJudul());

        Mahasiswa ani = new Mahasiswa();
        ani.setData("anita", "juanda", "2 mei 2002", "ani@gmail.com", "0822000001");
        Penulis ali = new Penulis(); 
        Penerbit grammedia = new Penerbit(); 
        Prodi ti = new Prodi();

        Buku buku1 = ali.menulis("PBO 5 menit", 10, 2022);
        double biaya = grammedia.menerbitkan(buku1);
        double kembalian = ali.membayarPenerbitan(biaya, 1500000);
        ti.membeliBuku(buku1);
        ani.meminjamBuku(buku1);
        ani.menampilkanBuku();

    }   
}
