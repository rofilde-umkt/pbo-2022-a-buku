package peminjaman;

public class Penerbit {
    private String nama;
    private String alamat; 
    private String nomor; 
    private Buku[] buku = new Buku[100000];
    private int jumlahBuku = 0;

    public void setData(String n, String a, String nr) {
        this.nama = n;
        this.alamat = a;
        this.nomor = nr;
    }

    public void tampil() {
        System.out.println("Nama " + this.nama);
        System.out.println("Alamat " + this.alamat);
        System.out.println("Nomor " + this.nomor);

    }

    public double menerbitkan(Buku buku) {
        this.buku[this.jumlahBuku] = buku;
        this.jumlahBuku++;

        return 1000000;
    }
}
