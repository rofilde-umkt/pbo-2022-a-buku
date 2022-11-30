package peminjaman;

public class Penulis extends Akademisi{
    private Buku[] buku = new Buku[1000];
    private int jumlahBuku = 0;

    public Buku menulis(String judul, int halaman, int tahun) {
        Buku buku = new Buku();
        buku.setData(judul, tahun, halaman);

        this.buku[this.jumlahBuku] = buku;
        this.jumlahBuku++;


        return buku;
    }

    public double membayarPenerbitan(double biaya, double uang) {
        double kembalian = uang - biaya;

        return kembalian;
    }
}
