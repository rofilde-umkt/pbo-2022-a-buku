package peminjaman;

public class Prodi {
    private String nama; 
    private String bidang; 
    private Mahasiswa[] mahasiswa = new Mahasiswa[5000];
    private int jumlahMahasiswa = 0;
    private Buku[] buku = new Buku[100];
    private int jumlahBuku =0;

    public void setData(String n, String b ) {
        this.nama = n;
        this.bidang = b;
    }

    public void tampil() {
        System.out.println("Nama Prodi " + this.nama);
        System.out.println("Bidang Prodi " + this.bidang);
    }

    public void membeliBuku(Buku buku) {
        this.buku[this.jumlahBuku] = buku;
        this.jumlahBuku++;
    }
}
